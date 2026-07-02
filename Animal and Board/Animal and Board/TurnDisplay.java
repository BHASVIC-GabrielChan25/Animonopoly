import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TurnDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TurnDisplay extends Actor
{
    private int turn;
    public TurnDisplay()
    {
        this.turn = 1;
        setImage(new GreenfootImage("Turn: "+Integer.toString(turn), 30, Color.BLACK, Color.WHITE));
        
    }
    /**
     * Act - do whatever the TurnDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
  
    public void nextTurn()
    {
        turn++;
        setImage(new GreenfootImage("Turn: "+Integer.toString(turn), 30, Color.BLACK, Color.WHITE));
    }




}
