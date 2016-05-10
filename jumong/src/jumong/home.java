/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jumong;

/**
 *
 * @author peyman
 */
public class home {
    private int soldier;
    boolean lock=false;
    private boolean chest=false;
    private boolean key=false;
    private boolean energy=false;
    
    private boolean smallHealth=false;
    private boolean bigHealth=false;
    private boolean gold = false;
    private boolean fireArrow=false;
    private boolean smallArrow=false;
    private boolean bigArrow=false;
    private boolean hawk=false;
    private boolean bigBag=false;
    private boolean shovel=false;
    private boolean stoneBreaker=false;
    
    public void setSoldier(int t){
        
        soldier=t;
        if(soldier<0)
        soldier=0;
    }

    /**
     * @return the soldier
     */
    public int getSoldier() {
        return soldier;
    }

    /**
     * @return the lock
     */
    public boolean isLock() {
        return lock;
    }

    /**
     * @return the treasure
     */
    public boolean isChest() {
        return chest;
    }

    /**
     * @return the key
     */
    public boolean isKey() {
        return key;
    }

    /**
     * @return the energy
     */
    public boolean isEnergy() {
        return energy;
    }

    /**
     * @return the smallHealth
     */
    public boolean isSmallHealth() {
        return smallHealth;
    }

    /**
     * @return the bigHealth
     */
    public boolean isBigHealth() {
        return bigHealth;
    }
    public void setLock(){
        lock=false;
    
}
    public void setChest(boolean chest){
        this.chest= chest;
    }
    public void setKey(boolean key){
        this.key= key;
    }
    public void setEnergy(boolean energy){
        this.energy= energy;
    
}
    public void setSmallHealth(boolean samallHealth){
        this.smallHealth = samallHealth;
    }
    public void setBigHealth( boolean bigHealth){
        this.bigHealth= bigHealth;
    }

    /**
     * @return the gold
     */
    public boolean isGold() {
        return gold;
    }

    /**
     * @param gold the gold to set
     */
    public void setGold(boolean gold) {
        this.gold = gold;
    }
   public void print(){
       
       System.out.printf("the number of soldier is: %d\n", getSoldier());
       System.out.printf(" treasur: %s\n", isChest());
       System.out.printf("key: %s\n",isKey());
       System.out.printf("energy: %s\n", isEnergy());
       System.out.printf("smallHealth:%s\n", isSmallHealth());
       System.out.printf("big health: %s\n", isBigHealth());
       System.out.printf("gold is : %s\n\n\n", isGold());
   }

    /**
     * @return the fireArrow
     */
    public boolean isFireArrow() {
        return fireArrow;
    }

    /**
     * @param fireArrow the fireArrow to set
     */
    public void setFireArrow(boolean fireArrow) {
        this.fireArrow = fireArrow;
    }

    /**
     * @return the smallArrow
     */
    public boolean isSmallArrow() {
        return smallArrow;
    }

    /**
     * @param smallArrow the smallArrow to set
     */
    public void setSmallArrow(boolean smallArrow) {
        this.smallArrow = smallArrow;
    }

    /**
     * @return the bigArrow
     */
    public boolean isBigArrow() {
        return bigArrow;
    }

    /**
     * @param bigArrow the bigArrow to set
     */
    public void setBigArrow(boolean bigArrow) {
        this.bigArrow = bigArrow;
    }

    /**
     * @return the hawk
     */
    public boolean isHawk() {
        return hawk;
    }

    /**
     * @param hawk the hawk to set
     */
    public void setHawk(boolean hawk) {
        this.hawk = hawk;
    }

    /**
     * @return the bigBag
     */
    public boolean isBigBag() {
        return bigBag;
    }

    /**
     * @param bigBag the bigBag to set
     */
    public void setBigBag(boolean bigBag) {
        this.bigBag = bigBag;
    }

    /**
     * @return the shovel
     */
    public boolean isShovel() {
        return shovel;
    }

    /**
     * @param shovel the shovel to set
     */
    public void setShovel(boolean shovel) {
        this.shovel = shovel;
    }

    /**
     * @return the stoneBreaker
     */
    public boolean isStoneBreaker() {
        return stoneBreaker;
    }

    /**
     * @param stoneBreaker the stoneBreaker to set
     */
    public void setStoneBreaker(boolean stoneBreaker) {
        this.stoneBreaker = stoneBreaker;
    }
 
    
    
    
    
}
