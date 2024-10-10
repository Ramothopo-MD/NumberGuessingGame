
package numbergame;

import static java.lang.Math.round;
import java.util.Random;
import javax.swing.JOptionPane;


public class NumberGame {

    
    public static void main(String[] args) {
      Random rand =new Random();
      final int LIMIT=10;
      String feedBack="";
      double score=0;
      int count=0,countWon=0;
      int rounds=0;
      
          int option= DisplayMenu();
          while(option!=2){
              rounds++;
               int randNum=rand.nextInt(10)+1;
              for (int i = 0; i <LIMIT; i++) {
                 count++;
                     int guessNum=Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the number generated.","Guess Number",JOptionPane.DEFAULT_OPTION ));
             if(randNum==guessNum){
                 feedBack="Correct guess";
                 countWon++;
                           JOptionPane.showMessageDialog(null,feedBack, "Feedback",JOptionPane.PLAIN_MESSAGE);
                           break;
             }else if(guessNum>randNum){
                 feedBack="Too high";
                  JOptionPane.showMessageDialog(null,feedBack, "Feedback",JOptionPane.PLAIN_MESSAGE);
             }else{
                 feedBack="Too low";
                  JOptionPane.showMessageDialog(null,feedBack, "Feedback",JOptionPane.PLAIN_MESSAGE);
             }
              }
              
              
           option= DisplayMenu();   
          }
          summary( rounds , count,countWon);
         
         
      
    }

    private static int DisplayMenu() {
         int option=Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to play the guessing number game\n"
                    + "1-Yes\n2-No"
                    + "","Menu",JOptionPane.DEFAULT_OPTION ));
     return option;    
    }

    private static void summary(int rounds, int count,int countWon) {
       JOptionPane.showMessageDialog(null,"You won "+countWon+" guesses out of "+rounds*count+" attempts","Summary",JOptionPane.INFORMATION_MESSAGE);
       
    }
   
    
}
