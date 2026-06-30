import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    String name;
    public StartButton(String name)
    {
        this.name = name;
        setImage(new GreenfootImage(name, 30, Color.BLACK, Color.WHITE));
    }
    public void act()
    {
        spawn();
    }
    public void spawn()
    {
     if (Greenfoot.mouseClicked(this))
     {
         Player1 player1 = new Player1();
         getWorld().addObject(player1, 500, 500);
         Player2 player2 = new Player2();
         getWorld().addObject(player2, 600, 500);
         Player3 player3 = new Player3();
         getWorld().addObject(player3, 700, 500);
         Player4 player4 = new Player4();
        getWorld().addObject(player4, 400, 500);
        getWorld().addObject(new Money1(), 100, 770);  
        getWorld().addObject(new Money2(), 350, 770);
        getWorld().addObject(new Money3(), 600, 770);
        getWorld().addObject(new Money4(), 850, 770);
         getWorld().removeObject(this);
     }
    }

}
