import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyDisplay extends Actor
{
    /**
     * Act - do whatever the MoneyDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    protected int money;
    
    public MoneyDisplay()
    {
        this.money = 1500;
    }
    
    public void MoneyDepleted()
    {
        if (money <= 0)
        {
            getWorld().removeObject(this);
        }
    }
    public void act()
    {
        
    }

}
