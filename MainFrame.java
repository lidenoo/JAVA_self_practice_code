import javax.management.AttributeChangeNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 /*此為框架板模，數值帶入CLASS內產生元件*/ 
public class MainFrame extends JFrame {//繼承自Jframe

    private Container cp;
    

    //----帶入JButton的值-----
    protected void buttonPara(JButton button, int x,int y, int w, int h){
        button.setBounds(x,y,w,h);
        cp.add(button);  
    }
    //----帶入JLabel的值-----
    protected void labelPara(JLabel label, int x,int y, int w, int h){
        label.setBounds(x,y,w,h);
        cp.add(label);  
    }
    //----帶入JTextField的值-----
    protected void textPara(JTextField text, int x,int y, int w, int h){
        text.setBounds(x,y,w,h);
        cp.add(text);  
    }

    public void init_panelStart(){//container 生成
        cp = this.getContentPane();
        cp.setLayout(null);

    }
    
}
