

import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;
import java.util.*;


public class test2 extends MainFrame{
    
    //private Container cp;

    private JLabel jlb = new JLabel("0");

    private JButton jbtn0 = new JButton("0");
    private JButton jbtn1 = new JButton("1");
    private JButton jbtn2 = new JButton("2");
    private JButton jbtn3 = new JButton("3");
    private JButton jbtnAdd = new JButton("+");
    private JButton jbtnEq = new JButton("=");

    //Timer timer = new Timer();
    
    
    //private JTextField jfld = new JTextField();
    //private JButton jbtn3 = new JButton("NO");
    //private Container cp;
    //private int x = 1;

    //private String trueId;
    
    
    int result;
    String temp1;
    String temp2;

    //int xPos;
    
    
    public test2(){
        init();
        
    }

    private void init(){
        
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("測試");

        init_panelStart();//從MainFrame創造容器

        this.labelPara(jlb, 90, 50, 400, 25);
        //this.textPara(jfld, 220, 50, 120, 25);
        
        this.buttonPara(jbtn0,90,100,120,25);
        jbtn0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                coiledLabel("0");
            }
        });

        this.buttonPara(jbtn1,220,100,120,25);
        jbtn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                coiledLabel("1");
            }
        });

        this.buttonPara(jbtn2,90,135,120,25);
        jbtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                coiledLabel("2");

            }
        });

        this.buttonPara(jbtn3,220,135,120,25);
        jbtn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                coiledLabel("3");

            }
        });
        this.buttonPara(jbtnAdd,90,165,120,25);
        jbtnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
               
                //xPos=xPos+100;

            }
        });
        this.buttonPara(jbtnEq,220,165,120,25);
        jbtnEq.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
               
           

            }
        });
          
        
    }


    private void coiledLabel(String x){
        if(jlb.getText()== "0"){
            jlb.setText("");
        }
        jlb.setText(jlb.getText()+x);
    }

    private String add_function(String temp1,String temp2){
        int x = Integer.valueOf(temp1);
        int y = Integer.valueOf(temp2);
        result = x+y;
        temp1 = temp2;
        return Integer.toString(result);
    }

}



