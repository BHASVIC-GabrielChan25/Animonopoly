import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    protected int money;
    public int playerNumber;
    public Player(int PplayerNumber)
    {
        this.money = 1500;
        this.playerNumber = PplayerNumber;
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public int getMoney()
    {
        return money;
    }
    public void setMoney(int change)
    {
        this.money = change;
    }

}
