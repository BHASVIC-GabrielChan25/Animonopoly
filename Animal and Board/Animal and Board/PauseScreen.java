import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseScreen extends Actor
{
    protected GreenfootImage text = null;
    public PauseScreen()
    {
        text = new GreenfootImage(400,300);
        text.setColor(Color.BLACK);
        text.setFont(new Font(true, false, 50));
        text.drawString("Click anywhere \nto continue.", 0, 200);
        setImage(text);        
    }
    /**
     * Act - do whatever the PauseScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}
