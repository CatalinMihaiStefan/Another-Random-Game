/**
 * SpecialArea class with superClass ItemsArea represents the last area of the BoardGame class.
 * This class has 2 games that will be randomly selected for the designated GameArea.
 *The games are between the player and an opponent (local created).
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class SpecialArea extends ItemsArea
{
    /**
     * Field items list of class Items initialized. From items will be added to player .
     */
    Items specialItems = new Items(0,0,0,0,1);
    boolean isGameWon=false;

    /**
     * Constructor for SpecialArea class(one parameter required).
     * @param player is used to connect the actual player to the area in boardGame class.
     */
    public SpecialArea(Player player) {
        super(player);
    }

    /**
     * Getter for the boolean variable.
     * @return the value of variable isGameWon for ending the game.
     */
    public boolean isGameWon() {
        return isGameWon;
    }

    /**
     * This method  is required to win the game.
     * @param conditionFullfilled represents that the player has met the necessary requirements to obtain the key,
     *                           i.e. player has been at least once trough all the areas.
     */
    public void getSpecialItem(boolean conditionFullfilled)
    {
        if(conditionFullfilled)
        {
            this.isGameWon = true;
            player.collectedItems.addItem("specialItem");
            System.out.println("You win the  game. You got the specialItem.");
        }
        else
        {
            System.out.println("You did not meet the requirement to obtain the special key. Game over.");
        }
    }
}
