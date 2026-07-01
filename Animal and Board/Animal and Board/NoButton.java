import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoButoon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoButton extends Actor
{    
    public NoButton()
    {
        getImage().scale(getImage().getWidth() *2, getImage().getHeight()*2);
    }
    /**
     * Act - do whatever the NoButoon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(getWorld().getObjects(YesButton.class).get(0));
            getWorld().removeObject(getWorld().getObjects(PurchaseDisplay.class).get(0));
            getWorld().removeObject(this);
        }    
    }
}
