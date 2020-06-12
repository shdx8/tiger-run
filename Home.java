import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{

    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(825, 665, 1); 
        prepare ();
    }
    
    public void prepare ()
    {
      Play play = new Play();
      addObject(play, 610, 210);
      
      Hp helpku = new Hp();
      addObject(helpku, 610, 320);
      
      about abt= new about();
      addObject(abt, 610, 430);
    }
}
