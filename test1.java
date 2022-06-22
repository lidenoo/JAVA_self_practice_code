import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class test1 extends MainFrame{
    
    
    private JLabel jlb = new JLabel("0");
    private JButton jbtn = new JButton("OK");
    private JButton jbtn2 = new JButton("Generate");
    private JTextField jfld = new JTextField();
    //private JButton jbtn3 = new JButton("NO");
    //private Container cp;
    //private int x = 1;

    private String trueId;
    int count ;//count是計算失敗了幾次
    boolean swh = false;


    
    public test1(){
        init();
        
    }

    private void init(){

        this.setSize(400,400);//400x400視窗大小
        this.setLocationRelativeTo(null);//設定視窗位置，NULL為置中
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// EXIT_ON_CLOSE 按X即關閉視窗
        this.setTitle("身份證字號產生器-beta");//設定視窗標題
        this.setResizable(false);//視窗可否調整大小 :是
        ImageIcon image = new ImageIcon("icon001.png");//設定ICON

        this.setIconImage(image.getImage());



        init_panelStart();//從MainFrame創造容器

        //------把數值帶入mainFrame裡面-----
        this.labelPara(jlb, 90, 50, 120, 25);
        this.textPara(jfld, 220, 50, 120, 25);
        this.buttonPara(jbtn,90,100,120,25);
        this.buttonPara(jbtn2,220,100,120,25);
        //----按鈕1----
        jbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                String a = jfld.getText();
                String b =id_check(a);
                jlb.setText(b);
                jfld.setText("");
            }
        });

        //----按鈕2----
        jbtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                swh = true;
                id_generate("M","2");
                jfld.setText(trueId);
                jlb.setText("執行了"+count+"次");
                count = 0;
            }
        });
        
     
        

        
        
    }

    private void id_generate(String locate, String gender){
    //依據lacate及gender決定開頭的數字，未完成

        
        String tempId;
        while(swh == true){
            int min = 20000000;
            int max = 29999999;
            int i = (int)(Math.random()*max)+min;

            String ranNum = Integer.toString(i);
            tempId= locate+gender+ranNum;
          
            String resultCheck = id_check(tempId);
            
            if(resultCheck == "有效身份證字號"){
                    
                trueId= tempId;
                swh = false;
                break;
            }
        }
    
       
    }
    private String id_check(String id){
        
        int[] nums = {1,10,19,28,37,46,55,64,39,73,82,11,20,48,29,38,65,74,83,21,3,30,2,47,56,12};
        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','M','N','O','P','Q','T','U','V','W','X','Z','L','R','S','Y'};
        int headNum = 0;
        String idcheck = ".*[A-Za-z][1-2][0-9]{8}.*";

        boolean isMatch = Pattern.matches(idcheck, id);
        int result=0;
            if(isMatch == true){
                char[] a = id.toCharArray();
                for(int i=0;i<26;i++){

                    if(a[0] == alphabets[i]){
                        headNum=nums[i];
                    }
                }
                for(int i=1;i<=9;i++){
                    
                    int num = Character.getNumericValue(a[i]);
                    
                    result=result+(num*(9-i));
                    if((9-i)<1){
                        result=result+num;
                    }
                }
                if((result+headNum)%10 == 0){
                    System.out.println("有效身份證字號");
                    System.out.println("失敗了"+count+"次");
                    //count = 0;  
                    return "有效身份證字號";
                }
                else{
                    System.out.println("無效身份證字號"); 
                    count++;
                    
                    return "無效身份證字號";
                }  
            }
            else{
                System.out.println("格式不符");
                return "格式不符";
            }

           
    }



}


