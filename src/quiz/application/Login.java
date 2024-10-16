
package quiz.application;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame{
    JLabel name,cap;
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
        
        cap = new JLabel("Play on!");
         cap.setBounds(700,50,400,45);
         cap.setFont(new Font("Impact", Font.BOLD, 40));
          cap.setForeground(new Color(128, 0, 128));         
         add(cap);
        
         name  = new JLabel("Name:");
         name.setBounds(600,135,100,35);
         name.setFont(new Font("system", Font.BOLD,20));
         add(name);
         
        name1  = new JTextField();
         name1.setBounds(700,145,200,20);
         name1.setFont(new Font("system", Font.BOLD,20));
         add(name1);
        
         getContentPane().setBackground(Color.WHITE);
        
         setSize(1000,490);
         setLocation(300,200);
         setVisible(true);
       
    }
    public static void main(String args[]){
        new Login();
    }
}
