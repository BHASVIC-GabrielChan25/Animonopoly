import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerTurnDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTurnDisplay extends Actor
{
   
    private int turn;
    public PlayerTurnDisplay()
    {
        this.turn = 1;
        setImage(new GreenfootImage("Player "+Integer.toString(turn) +"'s turn", 30, Color.BLACK, Color.WHITE));

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
        if (turn>4)
        {
            turn = 1;
        }
        setImage(new GreenfootImage("Player "+Integer.toString(turn) +"'s turn", 30, Color.BLACK, Color.WHITE));

    }
}
