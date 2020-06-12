import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jalan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jalan extends Actor
{
    int track_speed = 6;
    /**
     * Act - do whatever the jalan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.

                //setLocation( getX() - 6 , getY() );
        //int x = getX();
        //int y = getY();
        //setLocation(x-6,y);
        setLocation( getX() - track_speed , getY() );
        //if(getX() == 0)
        {
           //this.setLocation(600, 350);
                
        }
                
    }    
}
