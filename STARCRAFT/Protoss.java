import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Protoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Protoss extends Actor
{
    GifImage myGif = new GifImage ("Protoss.gif");
    /**
     * Act - do whatever the Protoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(300, 300);
        click();
        setImage(myGif.getCurrentImage());
    }    
    
    public void click() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Batalla2());
        }
    }    
}
