
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Quiz extends JFrame implements ActionListener{
JLabel qno,ma;
JRadioButton one,two,three,four;
JButton next,exit,submit;
ButtonGroup groupoption;
String question[][] =new String[10][5];
String answers[][] = new String[10][2];
String useranswer[][] = new String[10][1];
public static  int timer = 15;
public static int ans_given =0;
public static int count =0;
public static int score=0;
String name;
     Quiz(String name) {
         this.name=name;
         setLayout(null);
         
         
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1440,391);
        add(image);
        
         qno = new JLabel();
         qno.setBounds(70,450, 50,30);
         qno.setFont(new Font("System",Font.BOLD,20));
         add(qno);
         
          ma= new JLabel();
         ma.setBounds(100,450, 900,30);
         ma.setFont(new Font("System",Font.BOLD,20));
         add(ma);
         
        

question[0][0] = "What is the size of an int in Java?";
question[0][1] = "8 bits";
question[0][2] = "16 bits";
question[0][3] = "32 bits";
question[0][4] = "64 bits";

question[1][0] = "Which of the following is not a primitive data type in Java?";
question[1][1] = "int";
question[1][2] = "float";
question[1][3] = "char";
question[1][4] = "String";

question[2][0] = "What is the default value of a boolean variable in Java?";
question[2][1] = "true";
question[2][2] = "false";
question[2][3] = "0";
question[2][4] = "null";

question[3][0] = "Which method is used to start a thread in Java?";
question[3][1] = "run()";
question[3][2] = "start()";
question[3][3] = "execute()";
question[3][4] = "init()";

question[4][0] = "Which of the following is a superclass of every class in Java?";
question[4][1] = "String";
question[4][2] = "Object";
question[4][3] = "Class";
question[4][4] = "Collections";

question[5][0] = "What is the output of 10 + 20 + 'Hello' in Java?";
question[5][1] = "30Hello";
question[5][2] = "1020Hello";
question[5][3] = "Hello30";
question[5][4] = "Error";

question[6][0] = "Which of the following is used to handle exceptions in Java?";
question[6][1] = "try-catch";
question[6][2] = "if-else";
question[6][3] = "for loop";
question[6][4] = "switch-case";

question[7][0] = "Which keyword is used to inherit a class in Java?";
question[7][1] = "implement";
question[7][2] = "extends";
question[7][3] = "inherit";
question[7][4] = "import";

question[8][0] = "Which of the following is a marker interface?";
question[8][1] = "Serializable";
question[8][2] = "Runnable";
question[8][3] = "Cloneable";
question[8][4] = "Comparable";

question[9][0] = "What does the final keyword in Java signify when applied to a variable?";
question[9][1] = "The variable can be modified.";
question[9][2] = "The variable cannot be modified.";
question[9][3] = "The variable is abstract.";
question[9][4] = "The variable is transient.";


answers[0][1] = "32 bits";
answers[1][1] = "String";
answers[2][1] = "false";
answers[3][1] = "start()";
answers[4][1] = "Object";
answers[5][1] = "30Hello";
answers[6][1] = "try-catch";
answers[7][1] = "extends";
answers[8][1] = "Serializable";
answers[9][1] = "The variable cannot be modified.";

         one = new JRadioButton();
         one.setBounds(100, 490, 700, 30);
         one.setBackground(Color.WHITE);
         one.setFont(new Font("Dialog",Font.PLAIN,20));
         add(one);
         
          two = new JRadioButton();
         two.setBounds(100, 530, 700, 30);
         two.setBackground(Color.WHITE);
         two.setFont(new Font("Dialog",Font.PLAIN,20));
         add(two);
         
         three = new JRadioButton();
         three.setBounds(100, 570, 700, 30);
         three.setBackground(Color.WHITE);
         three.setFont(new Font("Dialog",Font.PLAIN,20));
         add(three);
         
          four = new JRadioButton();
         four.setBounds(100, 610, 700, 30);
         four.setBackground(Color.WHITE);
         four.setFont(new Font("Dialog",Font.PLAIN,20));
         add(four);
         
         
         
         
         
         groupoption = new ButtonGroup();
         groupoption.add(one);
         groupoption.add(two);
         groupoption.add(three);
         groupoption.add(four);
         
         
          next = new JButton("Next");
         next.setBounds(520, 690, 100, 30);
         next.setBackground(new Color(128,0,128));
         next.setForeground(Color.WHITE);
         next.addActionListener(this);
         add(next);
         
         submit = new JButton("Submit");
         submit.setBounds(685, 690, 100, 30);
         submit.setBackground(new Color(128,0,128));
         submit.setForeground(Color.WHITE);
         submit.setEnabled(false);
             submit.addActionListener(this);
         add(submit);
         
         exit = new JButton("Exit");
         exit.setBounds(850, 690, 100, 30);
         exit.setBackground(new Color(128,0,128));
         exit.setForeground(Color.WHITE);
             exit.addActionListener(this);
         add(exit);
         
         setBounds(10, 0, 1440, 850);
         getContentPane().setBackground(Color.WHITE);
         
         start(count);
         
         setVisible(true);
          
    }
     
     public void paint(Graphics g){
         super.paint(g);
         String time ="Time Left - "+timer+ " Seconds";
         g.setColor(Color.red);
         g.setFont(new Font("System",Font.BOLD,25));
         if(timer>0){
             g.drawString(time, 1160, 500);
         }
         else{
             g.drawString("Times up!!!", 1300, 500);
         }
         timer--;
         try{
            Thread.sleep(1000);
             repaint();
         }
         catch(Exception e){
             e.printStackTrace();
         }
         if(ans_given==1){
             ans_given=0;
             timer=15;
         }
         else if(timer<0){
             timer = 15;
              if(count == 8){
                 next.setEnabled(false);
                 submit.setEnabled(true);
             }
              if(count==9){
                if(groupoption.getSelection()==null){
                 useranswer[count][0]="";
             }
             else{
                 useranswer[count][0]=groupoption.getSelection().getActionCommand();
             } 
                for(int i=0;i<useranswer.length;i++){
                    if(useranswer[i][0].equals(answers[i][1])){
                        score+=10;
                    }
                    else{
                        score+=-1;
                    }
                }
                setVisible(false);
                //Score
              }
              else{
             if(groupoption.getSelection()==null){
                 useranswer[count][0]="";
             }
             else{
                 useranswer[count][0]=groupoption.getSelection().getActionCommand();
             }
             count++;
             start(count);
              }
         }
         
     }
    public void start(int count){
        qno.setText(""+(count + 1)+"." );
        ma.setText(question[count][0]);
        one.setText(question[count][1]);
        one.setActionCommand(question[count][1]);
        
       two.setText(question[count][2]);
       two.setActionCommand(question[count][2]);
       
       three.setText(question[count][3]);
       three.setActionCommand(question[count][3]);
       
       four.setText(question[count][4]);
       four.setActionCommand(question[count][4]);
       
       groupoption.clearSelection();
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
       if(ae.getSource()==next){
           repaint();
           timer=15;
           ans_given=1;
             if(groupoption.getSelection()==null){
                 useranswer[count][0]="";
             }
             else{
                 useranswer[count][0]=groupoption.getSelection().getActionCommand();
             }
             if(count == 8){
                 next.setEnabled(false);
                 submit.setEnabled(true);
             }
             count++;
             
             
           start(count);
       } 
     else if(ae.getSource()==submit){
         ans_given =1;
             if(groupoption.getSelection()==null){
                 useranswer[count][0]="";
             }
             else{
                 useranswer[count][0]=groupoption.getSelection().getActionCommand();
             } 
                for(int i=0;i<useranswer.length;i++){
                    if(useranswer[i][0].equals(answers[i][1])){
                        score+=10;
                    }
                    else{
                        score+=-1;
                    }
                }
                setVisible(false);
               new Score(name, score);
       } 
     else if(ae.getSource()==exit){
           System.exit(0);
       } 
    }
    public static void main(String[] args) {
        new Quiz("User");
    }
    
}
