import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter()
    {
      GreenfootImage img = new GreenfootImage (100,30);
      img.drawString ("score : 0",7,20);
      setImage (img);
    }
    public void act() 
    {
      //setImage(new GreenfootImage("" + score, 24, Color.GREEN, Color.WHITE));
      //setImage("skor.png" + score);
      GreenfootImage img = new GreenfootImage (100,30);
      img.drawString ("score : " + score,7,20);
      setImage (img);
    }    
    public void addScore()
    {
        score++;
    }
}
