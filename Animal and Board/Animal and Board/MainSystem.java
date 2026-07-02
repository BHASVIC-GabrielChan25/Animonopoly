import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainSystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainSystem extends Actor
{
    private boolean gameEnd = false;
    private int timer = 0;
    /**
     * Act - do whatever the MainSystem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        game();
        if(gameEnd)
        {
            Greenfoot.stop();
        }
        
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
    public boolean isPaused()
    {
        getWorld().addObject(new PauseScreen(), 700, 300);
        if(Greenfoot.mouseClicked(getWorld()))
        {
            getWorld().removeObject(getWorld().getObjects(PauseScreen.class).get(0));
            return false;
        }
        return true;
    }
    public void pause()
    {
        World pause = new Pause(getWorld(),  getWorld().getObjects(Player1.class).get(0), getWorld().getObjects(Player2.class).get(0), getWorld().getObjects(Player3.class).get(0), getWorld().getObjects(Player4.class).get(0));
        Greenfoot.setWorld(pause);
    }
    public void game()
    {
        TurnDisplay turnDisplay = getWorld().getObjects(TurnDisplay.class).get(0);
         for (int player = 1; player < 5; player++)
         {
             pause();   
             turnStart(player);
            
         }
        pause();
        turnDisplay.nextTurn();
        
        
    }
        public void turnStart(int playerTurn)
    {
        PlayerTurnDisplay playerTurnDisplay = getWorld().getObjects(PlayerTurnDisplay.class).get(0);
        Dice dice = getWorld().getObjects(Dice.class).get(0);
        Player player = getCurrPlayer(playerTurn);
        pause();
        player.moveSpace(dice.roll());
        pause();
        playerTurnDisplay.nextTurn();
        


        
    }
}
