import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Spaces
{    
    Actor player;
    public Start ()
    {
        super(0,"Start", 0 ,0, 0);
            
    }
    /**
    * Act - do whatever the Start wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act()
    {
        whenLanded();
     }
    public void whenLanded()
    {
        detectPlayer();
        
    }
 
}
