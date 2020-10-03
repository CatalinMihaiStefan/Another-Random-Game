import java.util.Random;
/**
 * FightArea class represents one of the area of the BoardGame class.
 * This class simulates a fight between the player and an opponent (both of different clases).
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class FightArea implements FightInterface{

    /**
     *  Field warrior1 initialise a new object of type WarriorOpponent.
     */
    WarriorOpponent warrior1 = new WarriorOpponent();

    /**
     *  Field  player of class Player initialized.
     */
    Player player1;

    /**
     *  The field  will be used to assign the new random damage power of player .
     */
    int randDmgPlayer;

    /**
     *  The field  will be used to assign the new random damage power of opponent .
     */
    int randDmgWarrior;

    /**
     *  The field will be used to update the hp of player after every damage taken.
     */
    int newHPPlayer;

    /**
     *  The field will be used to update the hp of opponent after every damage taken.
     */
    int newHPWarrior;

    /**
     *  Field  used in case the player is losing or winning.
     */
    boolean ifPlayerLose;

    /**
     * Getter for field ifPlayerLose.
     * @return value of the boolean ifPlayerLose.
     */
    public boolean isIfPlayerLose() {
        return ifPlayerLose;
    }

    /**
     * Constructor for FightingArea class (one parameter required).
     * @param player1
     */
    public FightArea(Player player1) {
        this.player1= player1;
    }

    /**
     * This method (no required parameter) simulates a fight between the player and an opponent.
     * In case the player loses the game will be over, otherwise he gets a random item
     * and moves to the next area of the boardGame.
     */
    public void newFight()
    {
        System.out.println("************************");
        System.out.println("Your health is " + this.player1.getHP());
        System.out.println("Warrior health is " +( this.warrior1.getHP() - 20) );
        this.randDmgPlayer =  new Random().nextInt(this.player1.getDamage()) + 1;
        this.randDmgWarrior = new Random().nextInt(this.warrior1.getDamage()) + 1;


        if (this.player1.collectedItems.sword>=1)
            {
                this.randDmgPlayer += 20;
                player1.collectedItems.deleteItem("sword");
                System.out.println("You have a sword, your damage power raised with 20");
            }

        if(this.player1.collectedItems.shield>=1)
            {
                this.newHPPlayer += 10;
                player1.collectedItems.deleteItem("shield");
                System.out.println("You have a shield, your damage power raised with 5 and hp with 10. ");

            }

        //////
        System.out.println("************************");

        this.newHPPlayer = this.player1.getHP() - this.randDmgWarrior;
        System.out.println("Warrior damaged player with "+ this.randDmgWarrior);

        this.newHPWarrior= this.warrior1.getHP() - this.randDmgPlayer -20;
        System.out.println("Player damaged warrior with "+ this.randDmgPlayer);



        // Update player HP with the new HP, calculated after the damage.
        this.player1.setHP(this.newHPPlayer);
        this.warrior1.setHP(this.newHPWarrior);

        //condition for player to lose
        if (this.player1.getHP() <= 0 && this.warrior1.getHP() > 0)
                this.lose();

            //  if have item hp +60
        if (this.player1.getHP() <= 30 && this.player1.collectedItems.healthPotion>=1)
            {
                this.player1.setHP(this.player1.getHP() + 60);
                this.player1.collectedItems.deleteItem("healthPotion");
                System.out.println("Your HP is low, you were lucky that you have a HealthPotion, your HP is now " + player1.getHP());
            }
            // condition for player to win
        if (this.player1.getHP() > 0 && this.warrior1.getHP() <= 0)
                this.win();

            // In case both players are hp under 0
        if (this.player1.getHP() < 0 && this.warrior1.getHP() < 0)
                this.lose();

        // Condition for figth to continue
        if (this.player1.getHP() > 0 && this.warrior1.getHP() > 0)
        {
            System.out.println("************************");
            System.out.println("Your health is " + this.player1.getHP());
            System.out.println("Warrior health is " + this.warrior1.getHP());
            newFight();
        }
    }

    /**
     * Method that adds a random item if player wins.
     */
    public void win()
    {
        this.ifPlayerLose = false;
        String[] possibleItems = {"shield", "sword", "key", "healthPotion"};
        int randIndex = new Random().nextInt(4);
        this.player1.collectedItems.addItem(possibleItems[randIndex]);

        System.out.println("You win you got less damage, congratulation. You will get a item randomly");
    }

    /**
     * Method that will end the game for the player.
     */
    public  void lose()
    {
        this.ifPlayerLose = true;
        System.out.println("You lose , your Hp is under 0. Game over");
    }
}



