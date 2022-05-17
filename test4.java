import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;
public class test4 extends JFrame{
    
    private Container cp;
    int color1 = 1;
  public test4(){
        
        JButton jbtn = new JButton("+");
        JButton jbtn2 = new JButton("-");
        
  
        cp = this.getContentPane();
        cp.setLayout(null);
        



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//EXIT_ON_CLOSE 按下X關閉視窗
        this.setLocationRelativeTo(null);//null=視窗置中
        this.setSize(400,400);//設定視窗大小
        this.getContentPane().setBackground(new Color(0,color1,0));//顏色順序位置 R>G>B 範圍0~255



        jbtn.setBounds(90, 100, 120, 25);
        this.add(jbtn);
        jbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                
                getContentPane().setBackground(new Color(0,color1,0));
                color1=color1+10;
                if(color1 >255){
                    color1 = 1;
                }
            }
        });



        jbtn2.setBounds(220,100,120,25);
        this.add(jbtn2);
        jbtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                
                getContentPane().setBackground(new Color(0,color1,0));
                color1=color1-10;
                if(color1<0){
                    color1 = 1;
                }
            }
        });
    } 





}
