
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
JLabel heading,score1;
        JButton play,exit;
    Score(String name,int score) {
        
        setLayout(null);
         
         
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
         Image i2 = i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT );
         ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
          heading= new JLabel("Thankyou " + name +" for playing Java Expert");
         heading.setBounds(45,30, 700,30);
         heading.setFont(new Font("System",Font.BOLD,26));
         add(heading);
          score1= new JLabel("Your score: "+ score);
         score1.setBounds(350,200, 300,30);
         score1.setFont(new Font("System",Font.BOLD,26));
         add(score1);
        
            play = new JButton("Restart");
         play.setBounds(380, 270, 120, 30);
         play.setBackground(new Color(128,0,128));
         play.setForeground(Color.WHITE);
             play.addActionListener(this);
         add(play);
           exit = new JButton("Exit");
         exit.setBounds(380, 320, 120, 30);
         exit.setBackground(new Color(128,0,128));
         exit.setForeground(Color.WHITE);
             exit.addActionListener(this);
         add(exit);
         
        setBounds(400, 150, 750, 550);
         getContentPane().setBackground(Color.WHITE);
         setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==play){
            setVisible(false);
            new Login();
        }
        else{
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Score("user",0);
    }
}
