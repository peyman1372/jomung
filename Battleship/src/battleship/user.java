/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Scanner;

/**
 *
 * @author peyman
 */
public class user extends player {
    
    
        Scanner input = new Scanner (System.in);
    
    
     public void setT()
    {
        
          
    for(int i=0;i<2;i++)
         {
        System.out.print("Player Enter first integer");
        number1 = input.nextInt(10);
        while(number1>9){
               System.out.print("Player Enter right integer <10");
               number1 = input.nextInt(10);   
            
        }
        System.out.print("Player Enter second integer");
        number2 = input.nextInt(10);
        while(number2>9){
             System.out.print("Player Enter right integer <10");
        number2 = input.nextInt(10);
            
        }
        System.out.print("Player Enter length of ship integer");
         number3 =input.nextInt();
        if(number2>6){
         while(number3+number2>9){
            System.out.print("Player Enter right integer");
            number3 =input.nextInt();
        }   
        }
        while(number3>5){
            System.out.print("Player Enter right integer <6");
            number3 =input.nextInt();
        }
       
        for(int n=number3;n>=1;n--){
            
             playerArray[number1][number2]=1;
             number2+=1;
        }
       
         }
    
    
    }
    
    public point attack()
    { for(int i=0;i<1;i++)
         { 
            
        System.out.print("Player 1 Enter first integer");
        number1 = input.nextInt(10);
        while(number1>9){
              System.out.print("Player 1 Enter right integer <10");
              number1 = input.nextInt(10);
            
        }
        System.out.print("Player 1 Enter second integer");
         number2 = input.nextInt(10);
         while(number2>9){
              System.out.print("Player 1 Enter right integer");
              number2 = input.nextInt(10);
         }
    
         }
    
         point p = new point(number1, number2);
         return p;
    }
    
}
