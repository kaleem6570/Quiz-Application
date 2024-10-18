
package quiz.application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JLabel name,cap;
    JTextField name1;
    JButton Enter,Back;
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
         name.setBounds(610,135,100,35);
         name.setFont(new Font("system", Font.BOLD,20));
          name.setForeground(new Color(128, 0, 128));       
         add(name);
         
        name1  = new JTextField();
         name1.setBounds(680,145,200,20);
         name1.setFont(new Font("system", Font.BOLD,18));
         add(name1);
        Enter = new JButton("Enter");
        Enter.setBounds(640, 200, 100, 20);
        Enter.setBackground(new Color(128, 0, 128)); 
        Enter.setForeground(Color.WHITE);
        Enter.addActionListener(this);
        add(Enter);
        
        Back = new JButton("Back");
        Back.setBounds(780, 200, 100, 20);
        Back.setBackground(new Color(128, 0, 128)); 
        Back.setForeground(Color.WHITE);
          Back.addActionListener(this);
        add(Back);
         getContentPane().setBackground(Color.WHITE);
        
         setSize(1000,490);
         setLocation(300,200);
         setVisible(true);
       
    }
    public void actionPerformed(ActionEvent ae){
         String name =name1.getText();
        if(ae.getSource()==Enter){
            
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==Back){
            
            System.exit(0);
        }
       
       try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null,"Enter the name");
           }
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    public static void main(String args[]){
        new Login();
    }
}
