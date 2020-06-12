import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int track = 0;
    int tong = 0;
    int koin = 0;
  
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Counter counter = new Counter();
    
    GreenfootSound bg = new GreenfootSound("cb.mp3");
    public void started()
    {
        bg.playLoop();
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(825, 665, 1,false ); 
         
        prepare ();
        started();
    }
    public void act ()
    {
      Tong();
      Koin(); 
      Track();
    }
        public void Tong ()
    {
        tong++;
        if (tong==150){
              tong tongku = new tong();
              GreenfootImage image = tongku.getImage();
              addObject(tongku , getWidth(), getHeight()/1-120 + image.getHeight()/1-120);       
       //System.out.println(counter);
        tong = 0;
      }
    }
    public void Koin ()
    {
        koin++;
        if (koin==100){
              koin koinku = new koin();
              GreenfootImage image = koinku.getImage();
              addObject(koinku , getWidth(), getHeight()/1-174 + image.getHeight()/1-174);       
       //System.out.println(counter);
        koin = 0;
    }
    }
    public void Track ()
    {
        track++;
        if (track==50){
              jalan jalanku = new jalan();
              GreenfootImage image = jalanku.getImage();
              addObject(jalanku , getWidth(), getHeight()/1-102 + image.getHeight()/1-102);       
       //System.out.println(counter);
        track = 0;
      }
    }
    private void prepare ()
    {
        
        Jack jackku = new Jack();
        addObject(jackku,116,237);
        
        jalan jalan1 = new jalan();
        addObject(jalan1, 0, 350);
        
        jalan jalan2 = new jalan();
        addObject(jalan2, 597, 350);
        
        counter = new Counter();
        addObject(counter, 58, 22);
    }
    public Counter getCounter()
    {
        return counter;
    }
}
