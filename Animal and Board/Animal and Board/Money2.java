import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money2 extends MoneyDisplay
{
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Money2()
    {
        setImage(new GreenfootImage("Money2: " + money, 40, Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        update();
        setImage(new GreenfootImage("Money2: " + money, 40, Color.BLACK, new Color(0,0,0,0)));
    }
    public void update()
    {
        money = getWorld().getObjects(Player2.class).get(0).getMoney();
    }

}