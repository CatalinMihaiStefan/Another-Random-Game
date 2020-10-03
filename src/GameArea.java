import java.util.Random;

/**
 * GameArea class represents one of the area of the BoardGame class.
 * This class has 2 games that will be randomly selected for the designated GameArea.
 *The games are between the player and an opponent (local created).
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class GameArea
{
    /**
     *  Field  player of class Player initialized.
     */
    Player player;

    /**
     * Constructor for GameArea class(one parameter required).
     * @param player is used to connect the actual player to the are in boardGame class.
     */
    public GameArea(Player player) {
        this.player = player;
    }

    /**
     *  The choseGame it is randomly choses one of the following games:
     *  -rollDice;
     *  -rockPaperScissors;
     */

    public void choseGame()
        {
            int c =new Random().nextInt(2);
            if(c==1)
            {
                rollDice();
            }
            else
            {
                rockPaperScissorsInstruction();
                rockPaperScissors();
            }
        }

    /**
     * This method (no required parameter) simulates a game between the player and an opponent.
     * The result of dices for player and  opponent(represented by a local variable) it is randomly obtain .
     * These results are compared ,who has the bigger value of the 2 dices wins.
     * In case the player loses the game will repeat, otherwise he gets the key item
     * and moves to the next area of the boardGame.
     */
    public void rollDice() {

            int numberOfSides = 6;
            Random randomDice = new Random();
            //
            int resultPlayer= randomDice.nextInt(numberOfSides) + randomDice.nextInt(numberOfSides);

            //
            int resultOpponent= randomDice.nextInt(numberOfSides) + randomDice.nextInt(numberOfSides);

            System.out.println("the sum of your dices is " + resultPlayer );
            System.out.println("the sum of the opponent dices is " + resultOpponent );

        if (resultPlayer > resultOpponent)
        {
            System.out.println("Congratulation. You won!!!");
            System.out.println("The key item is the reward for the outcome of this game. \nNow you can enter the SpecialItem Area. ");
            player.collectedItems.addItem("key");
        }
         else if (resultPlayer < resultOpponent) {
            System.out.println("You lost. Try again.");
            rollDice();
        }
         else if (resultPlayer == resultOpponent) {
             System.out.println("It's a draw. Try again.");
             rollDice();
         }
    }

    /**
     * This method (no required parameter) displays the rules of rockPaperScissors game.
     */

    public void rockPaperScissorsInstruction()
    {
        System.out.println("Rules of Rock-Paper-Scissors are simple: \n1. Rock beats Scissors \n2. Paper beats Rock \n3. Scissors beats Paper \n Goodluck, you  will need. ");
    }

    /**
     * This method (no required parameter) simulates a game between the player and an opponent.
     * The result for player and  opponent(represented by a local variable) it is randomly obtain .
     * These results are compared and the winner is according to the rules of the game.
     * In case the player loses the game will repeat, otherwise he gets the key item
     * and moves to the next area of the boardGame.
     */
    public void rockPaperScissors()
    {

        Random randomChoice= new Random();
        String [] optionsRPS= {"Rock", "Paper", "Scissors"};

        int playerChoice1 = randomChoice.nextInt(optionsRPS.length);
        String playerChoice = optionsRPS[playerChoice1];

        int opponentChoice1 = randomChoice.nextInt(optionsRPS.length);
        String opponentChoice = optionsRPS[opponentChoice1];

        if(playerChoice.equals("Rock"))
        {
            if(opponentChoice.equals("Scissors"))
            {
                System.out.println("You chose Rock, the opponent chose Scissors. \n You win, congratulations.");
                System.out.println("The key item is the reward for the outcome of this game. \nNow you can enter the SpecialItem Area. ");
                player.collectedItems.addItem("key");

            }
            if(opponentChoice.equals("Rock"))
            {
                System.out.println("It's a draw ,both players choose Rock, try again." );
                rockPaperScissors();
            }

            if(opponentChoice.equals("Paper"))
            {
                System.out.println("You chose Rock, the opponent chose Paper \n You lose, try again.");
                rockPaperScissors();
            }
        }

        if(playerChoice.equals("Paper"))
        {
            if (opponentChoice.equals("Rock"))
            {
                System.out.println("You chose Paper, the opponent chose Rock, \n You win, congratulations!");
                System.out.println("The key item is the reward for the outcome of this game. \nNow you can enter the SpecialItem Area. ");
                player.collectedItems.addItem("key");
            }
            if (opponentChoice.equals("Paper"))
            {
                System.out.println("It's a draw , both chose Paper, try again.");
                rockPaperScissors();
            }
            if (opponentChoice.equals("Scissors"))
            {
                System.out.println("You chose Paper, your opponent chose Scissors. \n You lose, try again.");
                rockPaperScissors();
            }
        }
        if(playerChoice.equals("Scissors"))
        {
            if(opponentChoice.equals("Paper"))
            {
                System.out.println("You chose Scissors ,your opponent chose Paper. \nYou won, congratulations!");
                System.out.println("The key item is the reward for the outcome of this game. \nNow you can enter the SpecialItem Area. ");
                player.collectedItems.addItem("key");
            }
            if(opponentChoice.equals("Rock"))
            {
                System.out.println("You chose Scissors, your opponent chose Rock. \n You lost, try again.");
                rockPaperScissors();
            }

            if(opponentChoice.equals("Scissors"))
            {
                System.out.println("Its a draw, both chose Scissors. \n Try again.");
                rockPaperScissors();
            }

        }

    }

}
