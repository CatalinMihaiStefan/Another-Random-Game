/**
 * Testing for SpecialItemArea
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class TestSpecialArea {
    public static void main(String[] args) {
        Player player1 = new Player();
        boolean requirement;
        SpecialArea specialArea = new SpecialArea(player1);
        specialArea.getSpecialItem(true);
        specialArea.getSpecialItem(false);
    }


}
