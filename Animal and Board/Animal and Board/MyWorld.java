import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int start;
    StartButton startButton = new StartButton("Start ");

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1200, 800, 1); 
        prepare();
        addObject(startButton, 30, 15);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Board board = new Board();
        addObject(board,600,400);
        Start start = new Start();
        addObject(start,163,100);
        Skip skip = new Skip();
        addObject(skip, 1038,700);
        Animal cat = new Animal(1,"Cat",200);
        addObject(cat,288,100);
        Animal cow = new Animal(2, "Cow",200);
        addObject(cow,413,100);
        Animal sheep = new Animal (3, "Sheep",200);
        addObject(sheep, 538,100);
        Animal parrot = new Animal (4, "Parrot",250);
        addObject(parrot, 663,100);
        Animal koala = new Animal (5, "Koala", 250);
        addObject(koala, 788,100);
        Animal snake = new Animal (6, "Snake", 250);
        addObject(snake, 913,100);
        Animal rabbit = new Animal (7, "Rabbit", 300);
        addObject(rabbit, 1038, 100);
        Animal fox = new Animal (8, "Fox", 300);
        addObject(fox, 1038, 200);
        Animal turtle = new Animal (9, "Turtle", 300);
        addObject(turtle, 1038, 300);
        Animal frog = new Animal (10, "Frog", 350);
        addObject(frog, 1038, 400);
        Animal mice = new Animal (11, "Mice", 350);
        addObject(mice, 1038, 500);
        Animal skunk = new Animal (12, "Skunk", 350);
        addObject(skunk, 1038, 600);
        Animal seal = new Animal (14, "Seal", 400);
        addObject(seal,913,700);
        Animal otter = new Animal (15, "Otter", 400);
        addObject(otter, 788,700);
        Animal penguin = new Animal (16, "Penguin", 400);
        addObject(penguin, 663, 700);
        Animal dolphin = new Animal (17, "Dolphin", 450);
        addObject(dolphin, 538, 700);
        Animal polarBear = new Animal (18, "Polar Bear", 450);
        addObject(polarBear,413, 700);
        Animal shark = new Animal (19, "Shark", 450);
        addObject(shark, 288,700);
        Animal fish = new Animal (20, "Fish", 500);
        addObject(fish, 163, 700);
        Animal rhino = new Animal (21, "Rhino", 500);
        addObject(rhino, 163,600);
        Animal elephant = new Animal (22, "Elephant", 500);
        addObject(elephant, 163, 500);
        Animal crocodile = new Animal (23, "Crocodile", 600);
        addObject(crocodile, 163, 400);
        Animal tiger = new Animal (24, "Tiger", 600);
        addObject(tiger, 163,300);
        Animal lion = new Animal (25, "Lion", 600);
        addObject(lion, 163, 200);

    }
}
