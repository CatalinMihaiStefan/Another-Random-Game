/**
 * Testing for GameArea
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class TestGameArea {
    public static void main(String[] args) {
        Player player1= new Player();
        GameArea game1 = new GameArea(player1);

        game1.choseGame();
    }

}
