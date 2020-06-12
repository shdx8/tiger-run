import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jack extends Actor
{
    /**
     * Act - do whatever the Jack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean lompat;
    public int y = 0;
    public int speed = 1;
    public int up = 20;
    
    public GreenfootImage[] images = new GreenfootImage[8];
    public int jeda=15, a=1;
    
    public void addedToWorld(World MyWorld)
    {
        for(int i=1; i<images.length; i++){
            images[i] = new GreenfootImage("Lari ("+i+").png");
        }
        setImage(images[1]);
    }
    // actor berlari
    public void act ()
    {
        
        if(jeda ==0)
        {
            jeda=3;
        }
        if(jeda ==1)
        {
            setImage(images[a]);
            a++;
            if(a >= images.length)
            {
                a=1;
            }
        }
        if(jeda>0)
        {
            jeda--;
        }
        
        move();
        check();
        TabrakBarel();
    }
    
    // actor bergerak melompat
    public void move()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            jump();
            setImage(new GreenfootImage("jump (9).png"));
        }
        
    }
     public void jump()
    {
        if(lompat == false)
        {

            y = y - up;
            kebawah();
            setImage(new GreenfootImage("jump (9).png"));
        }
    }
    public void kebawah()
    {
        lompat = true;
        setLocation(getX(), getY() + y);
        y = y + speed;
    }
    public boolean jalan()
    {
        lompat = false;
        Actor jalan = getOneObjectAtOffset(0, getImage().getHeight()/1-48, jalan.class);
        return jalan != null;
    }
    public void check()
    {
        if(jalan())
        {
            y=0;
        }
        else if (jalan())
        {
            y=0;
        }
        else
        {
            kebawah();
        }
    }
    public void TabrakBarel()
    {
    if (isTouching(tong.class))
        {  
            Greenfoot.setWorld(new GameOver());
            
        }
    }
}
