import java.util.Random;
/**
 * BoardGame class holds all the areas of this game .
 * This class simulates and tests a complete game ,where the player goes trough all the areas.
 * The last area in the multidimensional array of 5 by 5, is SpecialArea were the game end.
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class BoardGame {

    /**
     * This method holds all the classes from this project .
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * List of areas that will be randomly assigned to the boardgame of 5 by 5.
         */
        String[] areas = {"GameArea", "FightArea", "PuzzleArea", "ItemsArea"};



        /**
         *  The array for the boardgame ,areas will be assigned to each position.
         */
        String [][] boardGame= new String[5][5];


        /**
         * Assigns ramndomly areas on the boardGame
         */
        for(int i=0; i<boardGame.length; i++)
        {
            for(int j=0; j<boardGame.length; j++)
            {
                boardGame[i][j]=getRandom(areas);


            }
        }
        // hardcode on the last position of the multi dimensional array the SpecialArea.
        boardGame[4][4]= "SpecialArea";

        /**
         *  Print the details of the matrice.
         */
        for(int i=0; i<boardGame.length; i++)
        {
            for(int j=0; j<boardGame.length; j++)
            {
                System.out.print(boardGame[i][j]+ "  ");
            }
            System.out.println();
        }
        int contorGameArea= 0;
        int contorFightArea= 0;
        int contorPuzzleArea= 0;
        int contorItemsArea= 0;

        //need to intialise player before looping through the board game because is the same character for all of the game areas.
        Player player1= new Player();

        //Label outer loop so that we can break from both for loops and not just from the inner loop
        outerloop:
        for(int i=0 ;i<= boardGame.length; i++)
        {
            for(int j=0; j<boardGame.length; j++ )
            {
                //if contains  GameArea
                if (boardGame[i][j] == areas[0])
                {

                    contorGameArea++;
                    System.out.println();
                    System.out.println("-----------------------------");
                    System.out.println(i+" "+j+"---Welcome to Game Area!!!---");
                    System.out.println("-----------------------------");
                    GameArea game1 = new GameArea(player1);
                    game1.choseGame();
                }
                //if contains FightArea
                if (boardGame[i][j] == areas[1])
                {
                    contorFightArea++;
                    System.out.println();
                    System.out.println("------------------------------");
                    System.out.println(i+" "+j+"---Welcome to Fight Area!!!---");
                    System.out.println("------------------------------");
                    // intialiase a new warior for each fight

                    FightArea fightArea1 = new FightArea(player1);
                    fightArea1.newFight();
                    if (fightArea1.isIfPlayerLose() == true)
                    {
                        break outerloop;
                    }
                    player1.collectedItems.displayItems();

                }
                //if contains PuzzleArea
                if(boardGame[i][j] == areas[2])
                {

                    contorPuzzleArea++;
                    System.out.println();
                    System.out.println("-------------------------------");
                    System.out.println(i+" "+j+"---Welcome to Puzzle Area!!!---");
                    System.out.println("-------------------------------");
                    PuzzleArea puzzle1 = new PuzzleArea(player1);
                    puzzle1.puzzle();
                    puzzle1.checkAnswer(2);
                    puzzle1.checkAnswer(1);


                }
                //if contains ItemArea
                if(boardGame[i][j] == areas[3])
                {

                    System.out.println();
                    System.out.println("-----------------------------");
                    System.out.println(i+" "+j+"---Welcome to Item Area!!!---");
                    System.out.println("-----------------------------");
                    ItemsArea itemsArea = new ItemsArea(player1);
                    itemsArea.keyNeeded();

                    //only if you entered can the contor go up
                    if(itemsArea.isEntered())
                        contorItemsArea++;

                }
                if (boardGame[i][j] == "SpecialArea")
                {
                    System.out.println();
                    System.out.println("-----------------------------");
                    System.out.println(i+" "+j+"---Welcome to Special Area!!!---");
                    System.out.println("-----------------------------");
                    boolean requirement;
                    if(contorFightArea>=1 && contorGameArea>=1 && contorItemsArea>=1 && contorPuzzleArea>=1)
                        requirement = true;
                    else
                        requirement = false;
                    SpecialArea specialArea= new SpecialArea(player1);
                    specialArea.getSpecialItem(requirement);
                    if(specialArea.isGameWon())
                        break outerloop;

                }
            }
        }
    }

    /**
     * This function receives an array and returns randomly one of its elememts.
     */
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }


}
