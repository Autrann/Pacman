import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanWorld extends World
{
    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();

        for(int x = 50; x < 550; x+= WIDTH_WALL) {
            wall = new Wall();
            addObject(wall,x,30);
            wall = new Wall();
            addObject(wall,x,350);
        }

        for(int y = 58; y < 200; y+= HEIGHT_WALL) {
            wall = new Wall();
            addObject(wall,50,y);
            wall = new Wall();
            addObject(wall,526,y);
        }

        

        Banana banana = new Banana();
        addObject(banana,455,88);
        BigBall bigBall = new BigBall();
        addObject(bigBall,342,160);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,239,198);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,184,269);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,352,260);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,356,97);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,266,131);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,236,287);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,291,215);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,453,243);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,100,274);
        Cherry cherry = new Cherry();
        addObject(cherry,447,164);
        strawberry.setLocation(437,276);
        cherry.setLocation(479,193);
        cherry.setLocation(463,189);
        cherry.setLocation(469,195);
        Strawberry strawberry3 = new Strawberry();
        addObject(strawberry3,525,279);
        strawberry.setLocation(319,286);
        smallBall.setLocation(413,278);
        strawberry3.setLocation(479,279);
        cherry.setLocation(430,193);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,185,185);
        
        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);
        
        Pacman pacman = new Pacman(hud);
        addObject(pacman, 140, 110);
    }
}
