/**
 * Testing for PuzzleArea
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class TestPuzzleArea {
    public static void main(String[] args) {
        Player player1 =new Player();
        PuzzleArea puzzle1 = new PuzzleArea(player1);
        puzzle1.puzzle();
        puzzle1.checkAnswer(7);
        puzzle1.checkAnswer(2);
        puzzle1.checkAnswer(1);
    }
}
