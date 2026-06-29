import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Spaces
{
    int levelOneStop;
    int levelTwoStop;
    int levelThreeStop;
    int levelFourStop;
    int cost;
    Player ownedby;
    public Animal (int Pspace, String Pname,int xCord,int yCord,int Pcost)
    {
        super(Pspace, Pname,xCord, yCord, Pcost);                    
    }
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void whenLanded()
     {
     
     }
}
