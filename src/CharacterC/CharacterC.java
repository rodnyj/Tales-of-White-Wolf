package CharacterC;

/**
 * Created by Colin on 3/29/2015.
 * version 1.0
 * Course ITEC 3860 Spring 2015
 *
 *The Purpose of this class is to be the base for saving and to refer to the player by the rest of the game
 *
 * This class is the CharacterClass. It is called CharacterC because the Class 'Character' is a protected class
 */
import Item.Item;
import java.util.ArrayList;
import java.util.HashMap;

public class CharacterC
{

    //create character inventory
    private HashMap<String, Item> inventory;

    //character name is used for saving and any story line at the beginning
    private String characterName;

    //character location refers to the room the character is currently in
    private int characterLocation;

    //equipped item changes the character strength value
    private Item equippedItem;

    //character strength gives the players attack value. it is modified by the weapon the player has equipped
    private int characterStrength;

    //character health gives the player a way to fail
    private int characterHealth;


    private Item item = new Item("Fist", "Weapon", 0);

    //character construction
    public CharacterC(String name)
    {
        this.inventory = new HashMap<String, Item>();
        this.characterName = name;
        this.characterLocation = 0;
        this.equippedItem = this.item;
        this.characterStrength = 5;
        this.characterHealth = 100;


    }

    public CharacterC()
    {
        this.inventory = new HashMap<String, Item>();
        this.characterName = "";
        this.characterLocation = 0;
        this.equippedItem = this.item;
        this.characterStrength = 5;
        this.characterHealth = 100;


    }

    //adding items to inventory
    public boolean addItemToInventory(Item item)
    {
        if(this.inventory.size() >= 10)
        {
            //output text saying no room in inventory
            return false;
        }
        else
        {
            this.inventory.put(item.getItemName(), item);
            return true;
        }
    }


    public int getCharacterHealth()
    {
        return characterHealth;
    }

    public void setCharacterHealth(int characterHealth)
    {
        this.characterHealth = characterHealth;
    }

    public HashMap<String, Item> getInventory()
    {
        return inventory;
    }

    public void setInventory(HashMap<String, Item> inventory)
    {
        this.inventory = inventory;
    }

    public String getCharacterName()
    {
        return characterName;
    }

    public void setCharacterName(String characterName)
    {
        this.characterName = characterName;
    }

    public int getCharacterLocation()
    {
        return characterLocation;
    }

    public void setCharacterLocation(int characterLocation)
    {
        this.characterLocation = characterLocation;
    }

    public Item getEquippedItem()
    {
        return equippedItem;
    }

    public void setEquippedItem(Item equippedItem)
    {
        this.equippedItem = equippedItem;
    }

    public int getCharacterStrength()
    {
        return characterStrength;
    }

    public void setCharacterStrength(int characterStrength)
    {
        this.characterStrength = characterStrength;
    }
}
