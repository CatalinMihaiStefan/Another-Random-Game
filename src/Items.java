/**
 * Items class contains all the items that exists in BoardGame.
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class Items {

    /**
     * Field created to raise hp with 10 and damage in fight with 5.
     */
    int shield;

    /**
     * Field created to raise damage in fight with 20.
     */
    int sword;

    /**
     * Field created to open ItemArea.
     */
    int key;
    /**
     * Field created to raise the healh with 60 in fight when hp is under 30.
     */

    int healthPotion;

    /**
     * Field created to win the game once it is acquired.
     */
    int specialItem;

    /**
     * Constructor with all the items required.
     * @param shield
     * @param sword
     * @param key
     * @param healthPotion
     * @param specialItem
     */
    public Items(int shield, int sword, int key, int healthPotion, int specialItem) {
        this.shield = shield;
        this.sword = sword;
        this.key = key;
        this.healthPotion = healthPotion;
        this.specialItem = specialItem;
    }

    /**
     * Method to add one item that exits in the list of this class.(one parameter required)
     * @param newItem
     */
    public void addItem(String newItem) {
        // use switch case method instead of if else method
        switch (newItem) {
            // if newItem equals String shield, then count of shield attribute increases.
            case "shield":
                this.shield++;
                break;
            case "sword":
                this.sword++;
                break;
            case "key":
                this.key++;
                break;
            case "healthPotion":
                this.healthPotion++;
                break;
            case "specialItem":
                this.specialItem++;
                break;
        }
    }


    /**
     * Method to delete one item that exits in the list of this class.(one parameter required)
     * @param newItem
     */
        public void deleteItem(String newItem)
        {
            //check if all are > 1

            // use switch case method instead of if else method
            switch (newItem)
            {
                // if newItem equals String shield, then count of shield attribute decreases.
                case "shield":
                    if(this.shield>=1)
                        this.shield--;
                    else
                        System.err.println("You can not use this item");
                    break;
                case "sword":
                    if(this.sword>=1)
                        this.sword--;
                    else
                        System.err.println("You can not use this item");
                    break;
                case "key":
                    if(this.key>=1)
                        this.key--;
                    else
                        System.err.println("You can not use this item");
                    break;
                case "healthPotion":
                    if(this.healthPotion>=1)
                        this.healthPotion--;
                    else
                        System.err.println("You can not use this item");
                    break;
                case "specialItem":
                    if(this.specialItem>=1)
                        this.specialItem--;
                    else
                        System.err.println("You can not use this item");
                    break;
            }
        }

    /**
     * Method to to display all the items that exits in the list.(one parameter required)
     */
    public void displayItems()
    {
        System.out.println("Number of items contained: \n "+ this.shield + " shield(s); \n" +this.sword + " sword(s);\n" +this.healthPotion +" healthPotion(s); \n"+this.key+" key(s);");
        System.out.println(this.specialItem+" special item");
    }






}
