import java.util.Random;

/**
 * ItemsArea class represents one of the area of the BoardGame class.
 * The condition to enter is to have a key item.
 *
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class ItemsArea
{
    
    /**
     * Field  player of class Player initialized.
     */
    Player player;
    
    /**
     * Field items list of class Items initialized. From items will be added to player .
     */
    Items items = new Items(5,5,5,5,0);

    /**
     * Field entered initialised with the purpose of knowing if contor in boardgame can go up or not.
     */
    boolean entered;


    /**
     * Constructor for ItemsArea class(one parameter required).
     * @param player is used to connect the actual player to the area in boardGame class.
     */
    public ItemsArea(Player player) {
        this.player = player;

    }

    /**
     * Getter for the boolean variable
     * @return the value of variable entered for entering the itemsArea.
     */
    public boolean isEntered() {
        return entered;
    }

    /**
     * This method (no required parameter) is created to give you access to
     * the area if you have the item key, otherwise it sends you to the next area.
     */

    public void keyNeeded (){
        if(player.collectedItems.key>0)
        {
            System.out.println("You have the key to open this area.You will now receive a random item.");
            this.entered = true;
            //use key in order to get a random item
            this.giveRandItem();
        }
        else
        {
            System.out.println("You don't have the key to open this area, so you will skip to the next area.");
            this.entered = false;
        }
    }

    /**
     * This method (no required parameter) adds to your collection an item randomly.
     *
     */
    public void giveRandItem(){
        String[] possibleItems = {"shield", "sword" , "healthPotion"};
        int randIndex = new Random().nextInt(3);
        this.player.collectedItems.addItem(possibleItems[randIndex]);
    }
}
