/**
 * CharacterProperties class represents the super class.
 * All these fields are inherited by the subclases.
 * The subclasses are WarriorOpponent and Player.
 *
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
public class CharacterProperties {
    /**
     * Field  hp initialized.
     */
    int hp = 100;

    /**
     * Field  player of class Player initialized.
     */
    int damage = 30;

    /**
     * Constructor for CharacterProperties class(no parameter required).
     *
     */
    public CharacterProperties() {
    }

    /**
     * Getter for hp.
     * @return value of hp
     */
    public int getHP() {
        return hp;
    }

    /**
     * Setter for hp.
     * @param hP sets a value.
     */
    public void setHP(int hp) {
        this.hp = hp;
    }

    /**
     * Getter for damage.
     * @return value of the damage.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Setter for damage.
     * @param damage sets a value.
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }


}
