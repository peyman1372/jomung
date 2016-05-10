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
public class player {
    
  public   int [][]playerArray ;
     
       int number1;
       int number2;
       int number3;
       private int n;
    player(){
        playerArray= new  int [10][10];
        
         for (int row = 0; row < playerArray.length; row++)
        {
            for (int column = 0; column < playerArray.length; column++)
                playerArray[row][column]=0;
       }
    }
   
        //nt number1;
        //nt number2;
        
        /*  for(int i=0;i<2;i++)
         {
        System.out.print("Player Emter first integer");
        number1 = input.nextInt();
        System.out.print("Player Emter second integer");
        number2 = input.nextInt();
        playerArray[number1-1][number2-1]=1;
         }
          for(int i=0;i<10;i++)
          {
         for(int j =0;j<10;j++)
         {
             System.out.printf("%d\t",playerArray[i][j] );
         }
              
         System.out.printf("\n");
        }
          
    }
    public void read1(){
        Scanner input = new Scanner (System.in);
        
      
       
        for(int i=0;i<1;i++)
         { 
            
        System.out.print("Player 1 Emter first integer");
        number1 = input.nextInt();
        System.out.print("Player 1 Emter second integer");
         number2 = input.nextInt();
    
     }
    }*/
     
     public void print( boolean block_tank ){
             for(int i=0;i<10;i++)
          {
         for(int j =0;j<10;j++)
         {
             if ( block_tank && playerArray[i][j] == 1 )
                System.out.printf("%d\t",0 );
             else
                System.out.printf("%d\t",playerArray[i][j] );
         }
              
         System.out.printf("\n");
        }
        }
    
   public void check (point p){
       
        setN(2);
        if( playerArray[p.getX()][p.getY()]==0)
        {
            
           playerArray[p.getX()][p.getY()]=2;
           
        }
        if(playerArray[p.getX()][p.getY()]==1){
            playerArray[p.getX()][p.getY()]=3;
            
            setN(getN() - 1);
        
        }
         }
   boolean end()
   {
       if (getN()==0){
           return false;
       }
       else 
       {
           return true;
       }
       
   }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void incrementN() {
        n ++;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
    public void plusN(){
        this.n+=n;
    }
       
    
 }

        
    

