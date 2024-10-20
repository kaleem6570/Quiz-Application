
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
JLabel cap,dep,re;
JButton play,back;
String name;
    Rules(String name) {
        this.name = name;
        setLayout(null);
        cap = new JLabel("Welcome"+" "+name+"!!!");
         cap.setBounds(360,40,400,45);
         cap.setFont(new Font("Impact", Font.BOLD, 40));
          cap.setForeground(new Color(128, 0, 128));         
         add(cap);
         
         re = new JLabel("Rules:");
         re.setBounds(10,140,400,45);
         re.setFont(new Font("system", Font.BOLD, 30));
          re.setForeground(new Color(128, 0, 128));         
         add(re);
         
          dep = new JLabel();
         dep.setBounds(10,120,800,400);
         dep.setFont(new Font("system", Font.PLAIN, 20));
          dep.setText("<html>"+"1. The quiz consists of 10 questions based on Java core concepts"+"<br><br>"+
                  "2. Each correct answer awards 1 point."+"<br><br>"+
                   "3. Each wrong answer deducts 1 point. "+"<br><br>"+
                  "4. No points are awarded or deducted for skipped questions."+"<br><br>"+
          "5. The final score is calculated based on the total points after answering all questions."+"<br><br>"+"<html>");         
         add(dep);
        
         play = new JButton("play");
         play.setBounds(350, 460, 100, 30);
         play.setFont(new Font("system",Font.BOLD,20));
         play.setForeground(Color.WHITE);
         play.setBackground(new Color(128, 0, 128));
         play.addActionListener(this);
         add(play);
          back = new JButton("Back");
         back.setBounds(500, 460, 100, 30);
         back.setFont(new Font("system",Font.BOLD,20));
         back.setForeground(Color.WHITE);
         back.setBackground(new Color(128, 0, 128));
         back.addActionListener(this);
         add(back);
        getContentPane().setBackground(Color.WHITE);
        
       setSize(1000,600);
         setLocation(300,200);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==play){
            
            setVisible(false);
           new Quiz(name).setVisible(true);
        }
        else if(ae.getSource()==back){
            
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
