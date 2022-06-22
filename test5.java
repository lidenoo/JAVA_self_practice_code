import javax.swing.*;
import java.awt.*;
import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class test5 extends JFrame   {
    

    public test5(){

        
    
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new BorderLayout());
        //--------- 新增元件------------------
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton button1 = new JButton("1");

        //--------- 定義PANEL顏色-------------
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        //--------- 定義PANEL大小-------------
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        button1.setPreferredSize(new Dimension(100,100));
        //---------- 讓PANEL出現並且定位PANEL位置------------
        this.add(panel1,BorderLayout.WEST);
        this.add(panel2,BorderLayout.NORTH);
        this.add(button1,BorderLayout.SOUTH);
        
        
    }

    


   


}
