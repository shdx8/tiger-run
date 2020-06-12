import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bantuan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bantuan extends World
{

    /**
     * Constructor for objects of class Bantuan.
     * 
     */
    public Bantuan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(825, 665, 1); 
        Back back = new Back();
        addObject(back, 570, 500);
    }
}
