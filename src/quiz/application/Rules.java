
package quiz.application;

import javax.swing.*;
import java.awt.*;

public class Rules extends  JFrame{
JLabel cap;
String name;
    Rules(String name) {
        setLayout(null);
        cap = new JLabel("Rules of the Quiz");
         cap.setBounds(360,40,400,45);
         cap.setFont(new Font("Impact", Font.BOLD, 40));
          cap.setForeground(new Color(128, 0, 128));         
         add(cap);
        
        getContentPane().setBackground(Color.WHITE);
        
       setSize(1000,490);
         setLocation(300,200);
         setVisible(true);
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
