import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    PlayerSelect world;
    String name;
    public Start(String name)
    {
        this.name = name;
        setImage(new GreenfootImage(name, 30, Color.BLACK, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage(name, 30, Color.BLACK, Color.WHITE));
    }
}
