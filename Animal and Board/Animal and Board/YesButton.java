import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YesButton extends Actor
{
    Player player = null;
    Spaces space = null;
    public YesButton()
    {
        getImage().scale(getImage().getWidth() *2, getImage().getHeight()*2);
    }
    /**
     * Act - do whatever the YesButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            buying();
            getWorld().removeObject(getWorld().getObjects(NoButton.class).get(0));
            getWorld().removeObject(getWorld().getObjects(PurchaseDisplay.class).get(0));
            getWorld().removeObject(this);
        }
    }
    public void buying()
    {
        int number = getWorld().getObjects(PurchaseDisplay.class).get(0).getNumber();
        switch (number)
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
        space = player.getIntersectingSpace();
        player.setMoney(player.getMoney() - space.getCost());
        space.setOwner(player);
        player.addOwned(space);
    }
}
