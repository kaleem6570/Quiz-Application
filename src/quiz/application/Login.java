
package quiz.application;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame{
    JLabel name;
    JTextField name1;
    Login(){
        setLayout(null);
        setTitle("Quiz");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,10,550,500);
        add(image);
        
         /*name  = new JLabel("Name");
         name.setBounds(100,140,100,35);
         name.setFont(new Font("System", Font.BOLD,20));
         add(name);*/
        
         getContentPane().setBackground(Color.WHITE);
        
         setSize(1000,490);
         setLocation(300,200);
         setVisible(true);
       
    }
    public static void main(String args[]){
        new Login();
    }
}
