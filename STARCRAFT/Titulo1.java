import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titulo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titulo1 extends Actor
{
    /**
     * Act - do whatever the Titulo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }
    
    public void click() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Instrucciones1());
        }
    }
}
