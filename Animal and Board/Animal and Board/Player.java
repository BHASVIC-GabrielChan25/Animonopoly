import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    protected int money;
    protected int playerNumber;
    protected List<Spaces> animalsOwned = new ArrayList<Spaces>();
    protected int timer;
    protected boolean sameSpace;
    protected Spaces lastSpace;
    public Player(int PplayerNumber)
    {
        this.money = 1500;
        this.playerNumber = PplayerNumber;
        this.timer = 0;        
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        check();
        
    }
    public int getMoney()
    {
        return money;
    }
    public void setMoney(int money)
    {
        this.money = money;
    }
    public int getNumber()
    {
        return playerNumber;
    }
    public boolean checkOnSpace()
    {
        if (getOneIntersectingObject(Spaces.class) != null)
        {
            return true;
        }
        return false;
    }
    
    public Spaces getIntersectingSpace()
    {
        if (getOneIntersectingObject(Spaces.class)!= null){
            Spaces space = getWorld().getObjectsAt(getX(), getY(),Spaces.class).get(0);
            return space;
        }
        return null;
        
    }
    
    public Player checkSpaceOwner()
    {
        Player player = getIntersectingSpace().getOwner();
        return player;
    }
    
    public void check()
    {
        if(checkOnSpace())
        {
            Spaces space = getIntersectingSpace();
            if(space != lastSpace){
                if (space.getNumber() == 0)
                {
                    this.money+= 200;
                }
                if (space.getNumber() != 0 && space.getNumber()!=13)
                {
                    if(space.getOwner()== null)
                    {
                        getWorld().addObject(new PurchaseDisplay(this.playerNumber),600,400);
                    }
                }
                lastSpace = space;
            
            }
        }
    }
    public List getOwned()
    {
        return animalsOwned;
    }
    public void addOwned(Spaces space)
    {
        this.animalsOwned.addFirst(space);
    }
    public void moveSpace(int moves)
    {
        Spaces currSpace = getIntersectingSpace();
        int number;
        if (currSpace!=null){
            number = currSpace.getNumber();
        }
        else{
            number = 0;
        }
        int newNumber = number+ moves;
        Spaces newSpace = searchSpace(newNumber);
        setLocation(newSpace.getX(), newSpace.getY()-30);
    }
    public Spaces searchSpace(int number)
    {
        List<Spaces> allSpaces = getWorld().getObjects(Spaces.class);
        
        for (int i =0; i < 26 ; i++)
        {
            if(allSpaces.get(i).getNumber() == number)
            {
                 return allSpaces.get(i);
            }
        }
        return null;
    }
}
