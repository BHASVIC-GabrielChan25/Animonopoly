import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Spaces
{
    private int levelOneStop;
    private int levelTwoStop;
    private int levelThreeStop;
    private int levelFourStop;
    private int cost;
    private int level;
    public Animal (int Pspace, String Pname,int Pcost)
    {
        super(Pspace, Pname, Pcost);  
        this.levelOneStop = cost / 10;
        this.levelTwoStop = cost / 4;
        this.levelThreeStop = cost;
        this.levelFourStop = cost * 2;
        this.level = 1;
    }
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void setOwner(Player player)
    {
        this.owner = player;
    }
    public Player getOwner()
    {
        return this.owner;
    }
    public int getCost()
    {
        return this.cost;
    }
    public void levelUp()
    {
        this.level++;
    }
    public int getLevel()
    {
        return this.level;
    }
    public int getLevelCost()
    {
        switch(level)
        {
            case 1:
                return this.levelOneStop;
            case 2:
                return this.levelTwoStop;
            case 3:
                return this.levelThreeStop;
            case 4:
                return this.levelFourStop;
            default:
                return 0;
        }
    }
}
