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
    Player ownedBy;
    public Animal (int Pspace, String Pname,int Pcost)
    {
        super(Pspace, Pname, Pcost);  
        this.levelOneStop = cost / 10;
        this.levelTwoStop = cost / 4;
        this.levelThreeStop = cost;
        this.levelFourStop = cost * 2;
        this.ownedBy = null;
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
