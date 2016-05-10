/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jumong;


/**
 *
 * @author peyman
 */
public class Jumong {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        map one =new map();
        one.wall();
        one.enemy();
        one.keySet();
        one.FireArrow();
        one.chestSet();
        one.SmallArrow();
        one.BigArrow();
        one.hawkSet();
        one.bigBagSet();
        one.stoneBreakerSet();
      //  one.printf();
        int d=0;
        while(d==0){
        one.printPlayer();
        System.out.print("\n\n");
        one.move();
        System.out.print("\n\n");
        one.printPlayer();
        System.out.print("\n\n");
        one.action();
        System.out.print("\n\n");
        one.printPlayer();
        one.end();
        
        
        }
        
        
       // move tow =new move();
       
    //    int d=0;
  //     while(d==0){
 //       one.print();
    //   one.move();
   //    one.score();
    //    one.print();
     //   int enoughLines = 50;
 
      //  for (int i = 0; i < enoughLines; i++) {
      //    System.out.println();
       //     } 
    }
       // move one = new move();
        // TODO code application logic here
    }

