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
    private PlayerTurnDisplay playerTurnDisplay;
    private boolean gameEnd;
    private int playerTurn;
    public TurnDisplay()
    {
        this.turn = 1;
        this.playerTurn = 1;
        this.gameEnd = false;
        setImage(new GreenfootImage("Turn: "+Integer.toString(turn), 30, Color.BLACK, Color.WHITE));
        
    }
    /**
     * Act - do whatever the TurnDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        while (!gameEnd)
        {
            turnStart(playerTurn);
        }
    }
  
    public void nextTurn()
    {
        turn++;
        setImage(new GreenfootImage("Turn: "+Integer.toString(turn), 30, Color.BLACK, Color.WHITE));    
    }
    public void turnStart(int playerTurn)
    {
        Dice dice = getWorld().getObjects(Dice.class).get(0);
        //pause
        //if space ->  roll();
        //according to roll, move();
        //check for anything, purcahse, start etc.
        //next player
        
        //AFTER ALL PLAYER
        //next turn
        
    }
    
    public Player getCurrPlayer(int playerTurn)
    {
        Player player = null; 
        switch (playerTurn)
        {
            case 1:
                player = getWorld().getObjects(Player1.class).get(0);
            case 2:
                player = getWorld().getObjects(Player2.class).get(0);
            case 3:
                player = getWorld().getObjects(Player3.class).get(0);
            case 4:
                player = getWorld().getObjects(Player4.class).get(0);
        } 
        return player;
    }
  

}
