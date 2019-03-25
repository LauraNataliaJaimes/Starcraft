import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{

    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 650, 1); 
        
        prepare();
    }
    
    public void prepare() {
        Titulo titulo = new Titulo();
        addObject(titulo, 410, 470);
        
        Titulo1 titulo1 = new Titulo1();
        addObject(titulo1, 1080, 470);
    }
}
