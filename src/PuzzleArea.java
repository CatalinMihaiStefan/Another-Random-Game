//import java.util.Scanner;
/**
 * PuzzlesArea class represents one of the area of the BoardGame class.
 * The condition to enter is to have a key item.
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class PuzzleArea {
    /**
     * Field  player of class Player initialized.
     */
    Player player;
    /**
     * Field  for the person who ask the question.
     */
    String guyWhoAsk ="Hi I'm the nameless guy. today I will ask you a ridle :";
    /**
     * Constructor for PuzzleArea class(one parameter required).
     * @param player is used to connect the actual player to the area in boardGame class.
     */
    public PuzzleArea(Player player) {
        this.player = player;

    }

    /**
     * Method created to display the puzzle represented by a question with possible answers.
     */
    public void puzzle() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(guyWhoAsk);
        System.out.println("If A is substituted by 4, B by 3, C by 2, D by 4, E by 3, F by 2 and so on. \n Then what will be total of the numerical values of the letters of the word SICK?");
        System.out.println("1. 11");
        System.out.println("2. 12");
        System.out.println("3. 10");
        System.out.println("---------------------------------------------------------------------------------");
    }

    /**
     * This method (one required parameter) offers to player possibility to answer
     * the puzzle above with an integer.
     * @param choice add an integer to answer the puzzle
     */
    public void checkAnswer(int choice){
        //For user input can be used>>
        //Scanner myScanner = new Scanner(System.in.);
        //int choice = myScanner.nextInt();

        if (choice == 1)
        {
            System.out.println("Congratulation you chose 1, you got the right answer");
        }
        else if ((choice == 2)||(choice == 3)) {
            System.out.println("You chose 2 or 3, you are wrong,try again");
            puzzle();
        }
        else {
            System.out.println("Invalid input ");
            puzzle();
        }
    }

}
