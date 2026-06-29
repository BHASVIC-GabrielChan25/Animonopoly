import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends Actor
{
    protected GreenfootImage background = null;
    protected int space  = 100;
    /**
     * Act - do whatever the Board wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Board()
    {
    
        background = new GreenfootImage (1001,701);
        background.setColor(Color.WHITE);
        background.fillRect(0,0,1000,700);
        background.setColor(Color.BLACK);
        
        setImage(background);
    }
    


}
