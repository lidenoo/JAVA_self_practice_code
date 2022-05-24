import javax.swing.*;
import java.awt.*;

public class test5 extends JFrame {
    

    public test5(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();


        panel1.setBackground(Color.red);

        panel1.setPreferredSize(new Dimension(100,100));


        this.add(panel1,BorderLayout.NORTH);


    }




}
