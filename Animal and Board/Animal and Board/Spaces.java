import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaces extends Actor
{
    protected int number = 100;
    protected String name;
    protected GreenfootImage background = null;
    protected Font font= new Font(false, false, 11);
    public Spaces(int Pnumber, String Pname,int xCord,int yCord)
    {
        this.number = Pnumber;
        this.name = Pname;
        background = new GreenfootImage (126,101);
        background.setColor(Color.BLACK);
        background.setFont(font);
        background.drawRect(xCord,yCord,125,100);
        background.drawRect(xCord,yCord,125,25);
        background.drawRect(xCord,yCord+75,125,25);
        setImage(background);
    }
    protected Player detectPlayer()
    {
        Actor player = getOneIntersectingObject(Player.class);
        return null;
    }
    /**
     * Act - do whatever the Spaces wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
