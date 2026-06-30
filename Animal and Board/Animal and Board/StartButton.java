import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    String name;
    public StartButton(String name)
    {
        this.name = name;
        setImage(new GreenfootImage(name, 30, Color.BLACK, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage(name, 30, Color.BLACK, Color.WHITE));
    }
}
