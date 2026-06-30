import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player4 extends Player
{
        public Player4()
    {
        super(4);
    }
    /**
     * Act - do whatever the Player4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int getMoney()
    {
        return money;
    }
    public void setMoney(int change)
    {
        this.money = change;
    }
}
