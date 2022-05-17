import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

/*TEST3程式練習

皆由Main.java去做執行

*/


public class test3 extends MainFrame{//繼承自MainFrame

    test3(){
        JLabel label_001 = new JLabel();
        label_001.setText("WATCH ME");
        this.add(label_001);
        label_001.setVerticalAlignment(JLabel.CENTER);
        //label_001.setHorizontalTextPosition(JLabel.CENTER);
        /*
        以下兩行為設定ICON用
        */ 
        ImageIcon image = new ImageIcon("icon001.png");//設定ICON
        this.setIconImage(image.getImage());
        //-----------------------------------------我是分隔線

        this.setSize(400,400);//設定視窗大小
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//EXIT_ON_CLOSE 按下X關閉視窗
        this.setLocationRelativeTo(null);//null=視窗置中
        this.getContentPane().setBackground(new Color(100,25,120));//顏色順序位置 R>G>B 範圍0~255
        //或是可從GOOGLE查詢顏色代碼例如:0xFFFFF


        

        this.setVisible(true);//設定視窗可否顯示
        

    }

    






    
}
