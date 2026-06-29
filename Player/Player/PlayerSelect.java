import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerSelect extends World
{
    
    public static int population = 0;
    Start startButton = new Start("Population: ");
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PlayerSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
        addObject(new Money1(), 100, 750);  
        addObject(new Money2(), 350, 750);
        addObject(new Money3(), 600, 750);
        addObject(new Money4(), 850, 750);
        addObject(startButton, 100, 50);
        showText("" + , 200, 50);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Boat boat = new Boat();
        addObject(boat,867,387);
        Car car = new Car();
        addObject(car,330,394);
        Car2 car2 = new Car2();
        addObject(car2,508,391);
        Rocket rocket = new Rocket();
        addObject(rocket,685,391);
        
    }
    
}
