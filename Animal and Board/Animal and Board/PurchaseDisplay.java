import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buyingDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PurchaseDisplay extends Actor
{
    private GreenfootImage background = null;
    protected Font font = new Font(true, false, 50);
    protected boolean button = false;
    protected int number;
    /**
     * Act - do whatever the buyingDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public PurchaseDisplay(int playerNumber)
    {
        background = new GreenfootImage(1002,602);
        background.setFont(font);
        background.setColor(Color.BLACK);
        background.fillRect(0,0,1000,600);
        background.setColor(Color.WHITE);
        background.fillRect(1,1,998,598);
        background.setColor(Color.BLACK);
        background.drawString("Would you like to purchase this animal?", 30,50);
        background.drawString("YES", 150,300);
        background.drawString("NO", 760,300);
        setImage(background);
        this.number = playerNumber;
    }
    public void act()
    {
        if(!button)
        {
            getWorld().addObject(new YesButton(),300,500);
            getWorld().addObject(new NoButton(),900, 500);
            button = true;
        }
    }
    public int getNumber()
    {
        return number;
    }
}
