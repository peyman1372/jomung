/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jumong;

import java.util.Scanner;
//import javax.print.DocFlavor;
import java.util.Random;
import java.lang.String;

/**
 *
 * @author peyman
 */
public class map  {
    Scanner input = new Scanner(System.in);
    public home [][] Map;
    int a=1;
    int b=1;
    int c=0;
    int energi=100;
    int health=100;
    int gold=0;
    int key=0;
    int fireArrow=0;
    int smallArrow=0;
    int bigArrow=0;
    int stoneBreaker=0;
    int hawk=0;
    int all=key +fireArrow +smallArrow +bigArrow+ stoneBreaker +hawk;
    int limit=50;
    int shovel=0;
    public map() {
        Map = new home [25][25];
        for(int i=0;i<25;i++){
            for(int j =0;j<25;j++){
                Map [i][j]=new home();
            }
        }
        for(int i=0;i<25;i++){
            Map[i][0].lock=true;
        }
         for(int i=0;i<25;i++){
            Map[i][24].lock=true;
        }
          for(int i=0;i<25;i++){
            Map[0][i].lock=true;
        }
           for(int i=0;i<25;i++){
            Map[24][i].lock=true;
        }
        
           Random award = new Random(); 
             for(int i=0;i<300;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setGold(true);
       }
       for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setSmallHealth(true);
       }
       for(int i=0;i<100;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setBigHealth(true);
       }
       
       for(int i=0;i<300;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setEnergy(true);
       }
       
       
       
    }
    public void wall(){
        Map[1][12].lock=true;
        Map[2][12].lock=true;
        Map[3][1].lock=true;
        Map[3][1].lock=true;
        Map[4][2].lock=true;
        Map[4][14].lock=true;
        Map[5][14].lock=true;
        Map[6][2].lock=true;
        Map[6][3].lock=true;
        Map[6][4].lock=true;
        Map[6][15].lock=true;
        Map[7][4].lock=true;
        Map[7][5].lock=true;
        Map[7][16].lock=true;
        Map[8][5].lock=true;
        Map[8][7].lock=true;
        Map[8][17].lock=true;
        Map[9][7].lock=true;
        Map[9][18].lock=true;
        Map[10][4].lock=true;
        Map[10][5].lock=true;
        Map[10][6].lock=true;
        Map[10][18].lock=true;
        Map[10][19].lock=true;
        Map[11][4].lock=true;
        Map[11][19].lock=true;
        Map[12][5].lock=true;
        Map[12][7].lock=true;
        Map[12][19].lock=true;
        Map[12][20].lock=true;
        Map[13][7].lock=true;
        Map[13][20].lock=true;
        Map[13][21].lock=true;
        Map[14][9].lock=true;
        Map[14][21].lock=true;
        Map[15][9].lock=true;
        Map[15][10].lock=true;
        Map[15][21].lock=true;
        Map[15][22].lock=true;
        Map[16][10].lock=true;
        Map[16][11].lock=true;
        Map[16][12].lock=true;
        Map[16][18].lock=true;
        Map[16][19].lock=true;
        Map[16][20].lock=true;
        Map[17][12].lock=true;
        Map[17][13].lock=true;
        Map[18][13].lock=true;
        Map[18][14].lock=true;
        Map[18][15].lock=true;
        Map[18][16].lock=true;
        Map[18][17].lock=true;
        Map[18][18].lock=true;
        Map[19][5].lock=true;
        Map[19][18].lock=true;
        Map[20][6].lock=true;
        Map[20][18].lock=true;
        Map[21][7].lock=true;
        Map[21][18].lock=true;
        Map[22][8].lock=true;
        Map[22][18].lock=true;
        Map[23][9].lock=true;
        Map[23][15].lock=true;
        Map[23][18].lock=true;
        Map[23][17].lock=true;
        Map[24][9].lock=true;
        Map[24][10].lock=true;
        Map[24][11].lock=true;
        Map[24][12].lock=true;
        Map[24][13].lock=true;
        Map[24][14].lock=true;
        Map[24][15].lock=true;
     
        
        
        
    }
    public void enemy(){
        Map[3][5].setSoldier(2);
        Map[1][2].setSoldier(3);
        Map[2][1].setSoldier(2);
        
    }
    public void keySet(){
        Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setKey(true);
       }
        Map[1][2].setKey(true);
        Map[2][1].setKey(true);
        Map[1][3].setKey(true);
        Map[3][1].setKey(true);
    }
    public void FireArrow(){
        Random award = new Random();
        for(int i=0;i<100;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setFireArrow(true);
       }
        Map[1][2].setFireArrow(true);
        Map[2][1].setFireArrow(true);
        Map[1][3].setFireArrow(true);
        Map[3][1].setFireArrow(true);
    }
    public void SmallArrow(){
        Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setSmallArrow(true);
       }
        Map[1][2].setSmallArrow(true);
        Map[2][1].setSmallArrow(true);
        Map[1][3].setSmallArrow(true);
        Map[3][1].setSmallArrow(true);
    }
     public void BigArrow(){
         Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setBigArrow(true);
       }
        Map[1][2].setBigArrow(true);
        Map[2][1].setBigArrow(true);
        Map[1][3].setBigArrow(true);
        Map[3][1].setBigArrow(true);
    }
     public void hawkSet(){
          Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setHawk(true);
       }
        Map[1][2].setHawk(true);
        Map[2][1].setHawk(true);
        Map[1][3].setHawk(true);
        Map[3][1].setHawk(true);
     }
     public void bigBagSet(){
          Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setBigBag(true);
       }
        Map[1][2].setBigBag(true);
        Map[2][1].setBigBag(true);
        Map[1][3].setBigBag(true);
        Map[3][1].setBigBag(true);
     }
     public void chestSet(){
          Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setChest(true);
       }
        Map[1][2].setChest(true);
        Map[2][1].setChest(true);
        Map[1][3].setChest(true);
        Map[3][1].setChest(true);
     }
     public void shovelSet(){
         
         Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setShovel(true);
       }
        Map[1][2].setShovel(true);
        Map[2][1].setShovel(true);
        Map[1][3].setShovel(true);
        Map[3][1].setShovel(true);
     }
     public void stoneBreakerSet(){
         
         Random award = new Random();
        for(int i=0;i<30;i++){
              int x  = award.nextInt(23);
              int y = award.nextInt(23);
              x+=1;
              y+=1;
              Map[x][y].setStoneBreaker(true);
       }
        Map[1][2].setStoneBreaker(true);
        Map[2][1].setStoneBreaker(true);
        Map[1][3].setStoneBreaker(true);
        Map[3][1].setStoneBreaker(true);
     }
     
     public void hawk(int n , int m){
         
        
       System.out.printf("the number of soldier is: %d\n", Map[a+n][b+m].getSoldier());
       System.out.printf(" treasur: %s\n", Map[a+n][b+m].isChest());
       System.out.printf("key: %s\n",Map[a+n][b+m].isKey());
       System.out.printf("energy: %s\n", Map[a+n][b+m].isEnergy());
       System.out.printf("smallHealth:%s\n", Map[a+n][b+m].isSmallHealth());
       System.out.printf("big health: %s\n", Map[a+n][b+m].isBigHealth());
       System.out.printf("gold is : %s\n", Map[a+n][b+m].isGold());
       System.out.printf("fireArrow is: %s\n",Map[a+n][b+m].isFireArrow());
       System.out.printf("smallArrow is: %s\n",Map[a+n][b+m].isSmallArrow());
       System.out.printf("bigArrow is: %s\n\n\n",Map[a+n][b+m].isBigArrow());
         
     }
     public void check(){
         
                              
         if(Map[a][b].isGold()==true){
                      gold();
                  }
                  if(Map[a][b].isKey()==true){
                      action();
                  }
                  if(Map[a][b].isFireArrow()==true){
                      action();
                  }
                   if(Map[a][b].isSmallArrow()==true){
                      action();
                  }
     }

   
   public void moveRight(){ 
                  b++;
                  if(Map[a][b].isLock()==true){
                              System.out.print("wall\n");
                              b--;
                              energi+=10;
                              move();
                              
                          }
                  print();
                  check();
                  health-=Map[a][b].getSoldier()*10;
                //  System.out.printf("%d %d",a,b);
                  energi-=10;
                  energy();
                  print();
                              
                              
                          
   
                   
                } 
    public void moveLeft(){
        b--;
        if(Map[a][b].isLock()==true){
                              System.out.print("wall\n");
                              b++;
                              energi+=10;
                              move();
                              
                          }
        print();
        check();
        energi-=10;
        health-=Map[a][b].getSoldier()*10;
        energy();
        print();
    
    }
    public void moveUp(){
         a--;
         if(Map[a][b].isLock()==true){
                              System.out.print("wall\n");
                              a++;
                              energi+=10;
                              move();
                              
                          }
         print();
         check();
         health-=Map[a][b].getSoldier()*10;
         energi-=10;
         energy();
         print();
        
        
                  
                       
    }
    public void moveDown(){
        a++;
        if(Map[a][b].isLock()==true){
                              System.out.print("wall\n");
                              a--;
                              energi+=10;
                              move();
                              
                          }
        print();
        check();
        health-=Map[a][b].getSoldier()*10;
        energi-=10;
        energy();
        print();
        
                  
    }
    
    public void move(){
    String move;
  //  while(input.hasNext())
   // {
        System.out.print("please enter your move: ");
        move = input.nextLine();
        switch(move){
            case "right":
                moveRight();
                action();
                break;
                
            case "left":
                moveLeft();
                action();
                break;
            case "up":
                moveUp();
                action();
                break;
            case "down":
                moveDown();
                action();
                break;
            case "action":
                action();
                break;
                
                        
                
        }
     } 
    public void energy(){
        if(energi>0){
        energi+=10;
        }
         else{
                   System.out.print("you have not enough this item");
                   action();    
                  }
        //Map[a][b].setEnergy();
        
    }
    public void smallHealth(){
        health+=20;
        Map[a][b].setSmallHealth(false);
        
    }
    public void bigHealth(){
        health+=50;
        Map[a][b].setBigHealth(false);
    }
    public void gold(){
        gold+=5;
        Map[a][b].setGold(false);
    }
    public void PFireArrow(){
       fireArrow+=1;
       Map[a][b].setFireArrow(false);
    }
     public void DFireArrow(){
       fireArrow-=1;
       Map[a][b].setFireArrow(true);
    }
    public void PSmallArrow(){
        smallArrow+=1;
        Map[a][b].setSmallArrow(false);
    }
    public void DSmallArrow(){
        smallArrow-=1;
        Map[a][b].setSmallArrow(true);
    }
    
    public void PBigArrow(){
        bigArrow+=1;
        Map[a][b].setBigArrow(false);
    }
     public void DBigArrow(){
        bigArrow-=1;
        Map[a][b].setBigArrow(true);
    }
    
    public void smallArrow(){
        if(smallArrow>0){
        smallArrow-=1;
        Map[a][b].setSoldier(Map[a][b].getSoldier()-1);
        }
         else{
                   System.out.print("you have not enough this item");
                   action();    
                  }
    }
    public void fireArrow(){
        if(fireArrow>0){
        fireArrow-=1;
        Map[a][b].setSoldier(Map[a][b].getSoldier()-1);
        
        Map[a+1][b].lock=false;        
        Map[a-1][b].lock=false;
        Map[a][b+1].lock=false;
        Map[a][b-1].lock=false;
        }
         else{
                   System.out.print("you have not enough this item");
                   action();    
                  }
    }
    public void bigAroow(){
        if(bigArrow>0){
        Map[a][b].setSoldier(0);
        }
         else{
                   System.out.print("you have not enough this item");
                   action();    
                  }
    }
    public void PKey(){
        key+=1;
        Map[a][b].setKey(false);
    }
     public void DKey(){
        key-=1;
        Map[a][b].setKey(true);
    }
     public void PStoneBreaker(){
         stoneBreaker+=1;
     }
     public void DStoneBreaker(){
         stoneBreaker-=1;
     }
     public void PHawk(){
         hawk+=1;
         Map[a][b].setHawk(false);
     }
     public void DHawk(){
         hawk-=1;
         Map[a][b].setHawk(true);
     }
     public void PShovel(){
         shovel+=1;
         Map[a][b].setShovel(false);
     }
     public void DShovel(){
         shovel-=1;
         Map[a][b].setShovel(true);
     }
     
    public void stoneBreaker(){
        if(stoneBreaker>0){
        Map[a+1][b].lock=false;
        Map[a-1][b].lock=false;
        Map[a][b+1].lock=false;
        Map[a][b-1].lock=false;
        }
         else{
                   System.out.print("you have not enough this item");
                   action();    
                  }
        
    }
    
        
        public void bigBag(){
            limit+=10;
            Map[a][b].setBigBag(false);
        }
        public void key(){
            if(Map[a][b].isChest()==true){
                Map[a][b].setBigArrow(true);
                Map[a][b].setSmallArrow(true);
                Map[a][b].setSmallHealth(true);
            }
                
        }
        public void shovel(){
            int x;
            int y;
            System.out.print("enter your x:");
            x=input.nextInt();
            System.out.print("enter your y:");
            y=input.nextInt();
            int dx=x-a;
            int dy=y-b;
            if(dx<0)
                dx=-dx;
            if(dy<0)
                dy=-dy;
            if(dx+dy>5)
                System.out.print("it's too far");
            else{
                if(Map[a][b].isLock()==true){
                    System.out.print("wall\n");
                }
                else{
                    a=x;
                    b=y;
                }
                    
            }
                
                
        }
        
    
    
     public void print(){
        
       
       System.out.printf("the number of soldier is: %d\n", Map[a][b].getSoldier());
       System.out.printf(" treasur: %s\n", Map[a][b].isChest());
       System.out.printf("key: %s\n",Map[a][b].isKey());
       System.out.printf("energy: %s\n", Map[a][b].isEnergy());
       System.out.printf("smallHealth:%s\n", Map[a][b].isSmallHealth());
       System.out.printf("big health: %s\n", Map[a][b].isBigHealth());
       System.out.printf("gold is : %s\n", Map[a][b].isGold());
       System.out.printf("fireArrow is: %s\n",Map[a][b].isFireArrow());
       System.out.printf("smallArrow is: %s\n",Map[a][b].isSmallArrow());
       System.out.printf("hawk is: %s\n",Map[a][b].isHawk());
       System.out.printf("bigBag is: %s\n",Map[a][b].isBigBag());
       System.out.printf("shovel is: %s\n",Map[a][b].isShovel());
       System.out.printf("stoneBreaker is: %s\n",Map[a][b].isStoneBreaker());
       System.out.printf("bigArrow is: %s\n\n\n",Map[a][b].isBigArrow());
   }
     public void action(){
         String action;
         System.out.print("please enter your action: ");
         action=input.nextLine();
         switch(action){
             case "energy" :{
                 energy();
                 printPlayer();
                 print();
                 break;
             } 
             case "pickSamllHealth":{
                 if(all<50){
                 smallHealth();
                 printPlayer();
                 print();
                 break;
                 }
                else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
             }
             case "pickBigHealth":{
                 if(all<limit)
                 {
                 bigHealth();
                 printPlayer();
                 print();
                 break;
                 }
                else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
             }
             case "smallArrow":{
                 if(smallArrow>0)
                 {
                  smallArrow();
                  printPlayer();
                  print();
                 break;
                 }
                 else{
                     System.out.print("you have not enough this item\n\n");
                     break;
                 }   
             }
             case "fireArrow":{
                 if(fireArrow>0)
                 {
                 fireArrow();
                 printPlayer();
                 print();
             }
                 
                 break;
             }
             case "bigArrow":{
                 if(bigArrow>0)
                 {
                 bigAroow();
                 printPlayer();
                 print();
                 }
                 break;
             }
             case "stoneBreaker":{
                 if(stoneBreaker>0)
                 {
                 stoneBreaker();
                 printPlayer();
                 print();
                 }
                 break;
             } 
             case "move":{
                 printPlayer();
                 print();
                 move();
                 break;
             } 
             case "pickKey":{
                 if(all<limit){
                 PKey();
                 printPlayer();
                 break;}
                 else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
             } 
             case "dropKey":{
                 if(key>0){
                 DKey();
                 printPlayer();
                 break;
                  }
                 else{
                     System.out.print("you have not enough this item\n\n");
                     break;
                 }   
             }
             case "pickFireArrow":{
                 if(all<limit){
                 PFireArrow();
                 printPlayer();
                 break;
                 }
                 
                     else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
                 
             }
             case "dropFireArrow":{
                 if(fireArrow>0){
                 DFireArrow();
                 printPlayer();
                 break;
                  }
                 else{
                     System.out.print("you have not enough this item\n\n");
                     break;
                 }   
             }
             case "pickSmallArrow":{
                 if(all<limit){
                 PSmallArrow();
               printPlayer();
                 break;
                 }
                 else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
             }
             case"dropSmallArrow":{
                 if(smallArrow>0)
                 {
                 DSmallArrow();
                 printPlayer();
                 break;
                  }
                 else{
                     System.out.print("you have not enough this item\n\n");
                     break;
                 }   
             }
              case"pickBigArrow":{
                  if(all<limit){
                  PBigArrow();
                  printPlayer();
                  break;}
                  else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
             }
              case"DropigArrow":{
                  if(bigArrow>0)
                  {
                  DBigArrow();
                  printPlayer();
                  break;
                   }
                 else{
                     System.out.print("you have not enough this item\n\n");
                     break;
                 }   
              }
              case"dropStoneBreaker":{
                  if(stoneBreaker>0){
                  DStoneBreaker();
                  printPlayer();
                  break;
                   }
                 else{
                     System.out.print("you have not enough this item\n\n");
                     break;
                 }   
              }
              case"pickStoneBreaker":{
                  if(all<limit){
                  PStoneBreaker();
                  printPlayer();
                  break;
                  }
                  else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
              }   
              case"hawk":{
                  if(hawk>0)
                  {
                  System.out.print("down \n");
                  hawk(1, 0);
                  System.out.print("\n\n");
                  System.out.print("up\n");
                  hawk(-1, 0);
                  System.out.print("\n\n");   
                  System.out.print("right\n");
                  hawk(0, 1);
                  System.out.print("\n\n");
                  System.out.print("left\n");
                  hawk(0, -1);
                  System.out.print("\n\n");
                  }
                  else{
                    System.out.print("you have not enough this item\n\n"); 
                    break;
                  }
                   }
              case"pickHawk":
              {
                  if(all<limit){
                  PHawk();
                  printPlayer();
                  break;}
                  else
                 {
                     System.out.print("your bag is full\n\n");
                     action();
                     break;
                 }
              }
              case"dropHawk":{
                  if(hawk>0){
                      DHawk();
                      printPlayer();
                      break;
                  }
                  else{
                   System.out.print("you have not enough this item");
                   break;    
                  }
              }
              case"pickBigBag":{
                  if(Map[a][b].isBigBag()==true){
                  bigBag();
                  System.out.print("limit of your bag is increased \n\n");
                  action();
                  break;}
                  else{
                      System.out.print("you can't pick this item\n\n");
                      action();
                      break;
                  }
              }  
              case"key":
              {
                  key();
                  print();
                  action();
                  break;
              }
              case"pickShovel":{
                  if(all<limit){
                  PShovel();
                  print();
                  action();
                  break;}
                  else{
                  System.out.print("you have not enough this item");
                   break;
              }
              }
              case"dropShovel":
              {   if(shovel>0){
                  DShovel();
                  print();
                  break;}
               else{
                   System.out.print("you have not enough this item");
                   break;    
                  }
              }
                  
         }
         
     }
     public void end(){
         if(energi==0){
             System.exit(0);
         }
         if(health==0){
           System.exit(0);  
         }
         if(a==24&&b==24){
             System.exit(0);
         }
     }
     
     
     public void printPlayer(){
         
         System.out.printf("your energy is: %s\n", energi);
         System.out.printf("your health is: %s\n",health);
         System.out.printf("your gold is: %s\n", gold);
         System.out.printf("your key is: %s\n", key);
         System.out.printf("your fireArrow is : %s\n",fireArrow);
         System.out.printf("your smallFire is : %s\n",smallArrow);
         System.out.printf("your hawk is : %s\n",hawk);
         System.out.printf("your shovel is : %s\n",shovel);
         System.out.printf("your stoneBreaker is : %s\n",stoneBreaker);
         System.out.printf("your bigArrow is %s\n\n\n",bigArrow);
     }
       public void printf(){
      for(int x=0;x<25;x++){
          for(int y=0;y<25;y++){
         
             if(Map[x][y].isFireArrow()==true){
                 System.out.printf("1 ");
             }
             else{
                  System.out.printf("0 ");
             }
             
             
          }
           System.out.printf("\n");
       }
   }
    
}
