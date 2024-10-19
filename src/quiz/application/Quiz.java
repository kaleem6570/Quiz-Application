
package quiz.application;

import javax.swing.*;
import java.awt.*;
public class Quiz extends JFrame{

     Quiz() {
         setLayout(null);
         
         
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1440,391);
        add(image);
         
         
         setBounds(10, 0, 1440, 850);
         getContentPane().setBackground(Color.WHITE);
         setVisible(true);
         
         
    }
    
    
    public static void main(String[] args) {
        new Quiz();
    }
    
}
