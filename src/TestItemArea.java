/**
 * Testing for ItemArea
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class TestItemArea {
    public static void main(String[] args) {
        Player player1 = new Player();
        ItemsArea itemsArea = new ItemsArea(player1);
        itemsArea.keyNeeded();
    }

    }
