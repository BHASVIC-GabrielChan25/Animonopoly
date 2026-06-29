import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1200, 800, 1); 
        prepare();
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
        Animal parrot = new Animal (4, "Parrot",200);
        addObject(parrot, 663,100);
        Animal koala = new Animal (5, "Koala", 200);
        addObject(koala, 788,100);
        Animal snake = new Animal (6, "Snake", 200);
        addObject(snake, 913,100);
        Animal rabbit = new Animal (7, "Rabbit", 200);
        addObject(rabbit, 1038, 100);
        Animal fox = new Animal (8, "Fox", 200);
        addObject(fox, 1038, 200);
        Animal turtle = new Animal (9, "Turtle", 200);
        addObject(turtle, 1038, 300);
        Animal frog = new Animal (10, "Frog", 200);
        addObject(frog, 1038, 400);
        Animal mice = new Animal (11, "Mice", 200);
        addObject(mice, 1038, 500);
        Animal skunk = new Animal (12, "Skunk", 200);
        addObject(skunk, 1038, 600);
        Animal seal = new Animal (14, "Seal", 200);
        addObject(seal,913,700);
        Animal otter = new Animal (15, "Otter", 200);
        addObject(otter, 788,700);
        Animal penguin = new Animal (16, "Penguin", 200);
        addObject(penguin, 663, 700);
        Animal dolphin = new Animal (17, "Dolphin", 200);
        addObject(dolphin, 538, 700);
        Animal polarBear = new Animal (18, "Polar Bear", 200);
        addObject(polarBear,413, 700);
        Animal shark = new Animal (19, "Shark", 200);
        addObject(shark, 288,700);
        Animal fish = new Animal (20, "Fish", 200);
        addObject(fish, 163, 700);
        Animal rhino = new Animal (21, "Rhino", 200);
        addObject(rhino, 163,600);
        Animal elephant = new Animal (22, "Elephant", 200);
        addObject(elephant, 163, 500);
        Animal crocodile = new Animal (23, "Crocodile", 200);
        addObject(crocodile, 163, 400);
        Animal tiger = new Animal (24, "Tiger", 200);
        addObject(tiger, 163,300);
        Animal lion = new Animal (25, "Lion", 200);
        addObject(lion, 163, 200);
    }
}
