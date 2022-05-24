import javax.swing.*;
import java.awt.*;

public class test5 extends JFrame {
    

    public test5(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new BorderLayout(10,10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));

        this.add(panel1,BorderLayout.WEST);
        this.add(panel2,BorderLayout.NORTH);

        //
    }




}
