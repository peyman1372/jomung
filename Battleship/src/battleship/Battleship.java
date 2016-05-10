/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author peyman
 */
public class  Battleship 
{

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     //point p;   
        System.out.printf("please enter number 1 to play with computer or number 2 play with another player:");
        int ply;
        ply= input.nextInt();
        
       
         if(ply==2){
          user one = new user();
          user two = new user();
          System.out.println("set tank user 1");
      one.setT();
      one.print(false);
      System.out.println("set tank usseer 2");
      two.setT();
      two.print(false);
      
    
        while(one.getN()!=0||two.getN()!=0)
        {         
            
            
      two.check(one.attack());
      System.out.println("fire user");
      two.print(false);
      System.out.println("second user");
       one.check(two.attack());
       one.print(false);
       
      for(int i=0;i<10;i++){
          for(int j=0;i<10;i++){
              if(one.playerArray[i][j]==1){
                  one.incrementN();
                  two.incrementN();
              }
          }
      }
   
     }   
        }
         
          if(ply==1){
          user one = new user();
           cpu cpu = new cpu();
      System.out.println("set tank user");
      one.setT();
      one.print(false);
      System.out.println("set tank cpu");
      cpu.setT();
      cpu.print(true);
      
      
      for(int i=0;i<10;i++){
          for(int j=0;j<10;j++){
              if(one.playerArray[i][j]==1){
                  one.incrementN();
              }
              if(cpu.playerArray[i][j]==1){
                  cpu.incrementN();
              }
          }
      }  
     
        while(one.getN()!=0||cpu.getN()!=0)
        {       
            one.setN(0);
            cpu.setN(0);
            
      cpu.check(one.attack());
      System.out.println("fire usre");
      cpu.print(true);
      System.out.println("fire cpu");
       one.check(cpu.attack());
       one.print(false);
      for(int i=0;i<10;i++){
          for(int j=0;j<10;j++){
              if(one.playerArray[i][j]==1){
                  one.incrementN();
              }
              if(cpu.playerArray[i][j]==1){
                  cpu.incrementN();
              }
          }
      }  
      
   
     }   
   
   }
        }
        
      user one = new user();
      
      
    
        
     

}