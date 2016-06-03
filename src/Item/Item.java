package Item;
/**Class: Item
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 1, 2015
 *
 *
 * This class - intersects the existence of all known items in the game
 *
 * Purpose: - acts as a parent to the three item children
 */

/**
 * @author karl
 *
 */
public class Item 
{
    private String itemName;
    private String type;
    private int damage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Item(String itemName, String type, int damage)
    {
        this.itemName = itemName;
        this.type = type;
        this.damage = damage;

    }

    public Item()
    {
        this.itemName="";
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}
