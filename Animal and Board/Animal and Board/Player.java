import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    protected int money;
    protected int playerNumber;
    protected List animalsOwned;
    protected int timer = 0;
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
        if (Greenfoot.isKeyDown("space") && timer>= 60)
        {
            move(10);
            check();
            timer = 0;
        }
        timer++;
    }
    public int getMoney()
    {
        return money;
    }
    public void setMoney(int change)
    {
        this.money = change;
    }
    public int getNumber()
    {
        return playerNumber;
    }
    public boolean checkOnSpace()
    {
        if (getOneIntersectingObject(Spaces.class) != null)
        {
            return true;
        }
        return false;
    }
    
    public Spaces getIntersectingSpace()
    {
        if (getOneIntersectingObject(Spaces.class)!= null){
            Spaces space = getWorld().getObjectsAt(getX(), getY(),Spaces.class).get(0);
            return space;
        }
        return null;
        
    }
    
    public Player checkSpaceOwner()
    {
        Player player = getIntersectingSpace().getOwner();
        return player;
    }
    
    public void check()
    {
        System.out.println("Hi");
    }
}
