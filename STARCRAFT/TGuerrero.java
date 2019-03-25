import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TGuerrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TGuerrero extends Terran
{
     GifImage myGif = new GifImage ("Humanoide.gif");
    /**
     * Act - do whatever the TGuerrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
