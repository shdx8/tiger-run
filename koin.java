import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class koin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class koin extends Actor
{
    /**
     * Act - do whatever the koin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       if (getX()==0)
        {
            setLocation(0,getY());
        }  
            setLocation(getX()-4,getY());
            
       kenaJack();
    } 
   public void kenaJack()
   {
    if (isTouching(Jack.class))
        {  
            MyWorld mywl =(MyWorld)getWorld();
            Counter counter = mywl.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
   } 
}
