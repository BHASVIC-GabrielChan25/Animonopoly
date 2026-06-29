import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Spaces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Spaces extends Actor
{
    protected int number = 100;
    protected String name;
    protected int cost;
    protected GreenfootImage background = null;
    protected Font font= new Font(true, false, 15);
    protected Player[] playerList = {null, null, null, null};
    
    public Spaces(int Pnumber, String Pname, int Pcost)
    {
        this.number = Pnumber;
        this.name = Pname;
        this.cost = Pcost;
        background = new GreenfootImage (126,101);
        background.setColor(Color.BLACK);
        background.setFont(font);
        background.drawRect(0,0,125,100);
        background.drawRect(0,0,125,25);
        background.drawRect(0,75,125,25);
        background.drawString(name,45,15);
        background.drawString(intToString(number),5,15);
        
        
        if (this.cost == 0)
        {
            background.drawString("N/A",50,90);
        }
        else
        {
            background.drawString(intToString(cost), 50,90);
        }
        setImage(background);
        
 
    }
    protected void detectPlayer()
    {
        if (getOneIntersectingObject(Player1.class)!=null)
        {
            playerList[0]=getWorld().getObjects(Player1.class).get(0);
        }
        else
        {
            playerList[0]=null;
        }
        
        if(getOneIntersectingObject(Player2.class)!=null)
        {
            playerList[1]=getWorld().getObjects(Player2.class).get(0);
        }
        else
        {
            playerList[1]=null;
        }
        
        
        if(getOneIntersectingObject(Player3.class)!=null)
        {
            playerList[2]=getWorld().getObjects(Player3.class).get(0);
        }
        else
        {
            playerList[2]=null;
        }
        
        
        if(getOneIntersectingObject(Player4.class)!=null)
        {
            playerList[3]=getWorld().getObjects(Player4.class).get(0);
        }
        else
        {
            playerList[3]=null;
        }
        
    }
    
    public void act()
    {
        // Add your action code here.
    }
    protected String intToString(int number)
    {
        String string = "%,d";
        return String.format(string, number);
    }
    
    protected abstract void whenLanded();

}
