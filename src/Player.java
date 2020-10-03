import java.util.ArrayList;

/**
 * Player class represents the actual player for all the activities in the areas of the BoardGame.
 * In this class we store the items collected.
 * It is a subclass of the CharacterProperties class.
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class Player extends CharacterProperties {

    /**
     * Field for array of items of Items class.
     */
    Items collectedItems = new Items(0,0,0,0,0);


    /**
     * Constructor (no parameters required) for Player class.
     */
    public Player() {
        super();
    }




}
