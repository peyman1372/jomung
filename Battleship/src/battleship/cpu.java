/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;
import java.util.Random;

/**
 *
 * @author peyman
 */
public class cpu extends player {
    
    
    private Random r = new Random();
    public void setT()
    {
    for(int i=0;i<2;i++)
         {
       // System.out.print("Player Emter first integer");
        number1 = r.nextInt(10);
      //  System.out.print("Player Emter second integer");
        number2 = r.nextInt(10);
        while(number2+3>9){
             number2 = r.nextInt(10);
        }
     //   playerArray[number1][number2]=1;
        for(int n=3;n>=1;n--){
            
             playerArray[number1][number2]=1;
             number2+=1;
        }
         }
    
    
    }
    
    public point attack()
    { for(int i=0;i<1;i++)
         { 
            
        //System.out.print("Player 1 Emter first integer");
        number1 = r.nextInt(10);
       // System.out.print("Player 1 Emter second integer");
         number2 = r.nextInt(10);
    
         }
    
         point p = new point(number1, number2);
         return p;
    }
}
