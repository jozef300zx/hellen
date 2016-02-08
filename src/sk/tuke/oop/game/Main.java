package sk.tuke.oop.game;

import sk.tuke.oop.game.actors.Ripley;
import sk.tuke.oop.game.actors.Alien;
import sk.tuke.oop.framework.SlickWorld;
import sk.tuke.oop.game.actors.Energy;


/**
 *
 * @author Manager
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SlickWorld slickWorld = new SlickWorld("Aliens",800,600);
        Ripley ripley = new Ripley();
        Alien alien = new Alien();
        Energy energy = new Energy();
        Energy energy2 = new Energy();
        
        
        ripley.setHealth(50);
        ripley.setPosition(300, 300);
        
        energy.setPosition(200, 300);
        energy2.setPosition(500, 300);
        
        alien.setPosition(500, 300);
        
        slickWorld.addActor(ripley);
        slickWorld.addActor(energy);
        slickWorld.addActor(energy2);
        slickWorld.addActor(alien);
        slickWorld.run();
    }
    
}
