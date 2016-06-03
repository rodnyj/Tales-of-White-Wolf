package Item;
/**Class: Spell
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 1, 2015
 *
 *
 * This class - the third and final incarnation of an Item
 *
 * Purpose: - takes on the entity of "Spell"
 */

/**
 * @author karl
 *
 */
public class Spell extends Item
{
	private String name;
	private String strength;
	private String type;
	
	/**
	 * The Spell default constructor
	 * Contains the null values of the name, strength and type of the spell
	 */
	public Spell()
	{
		name = "";
		strength = "";
		type = "";
	}

	/**
	 * Method: getName
	 * @return the title of the spell
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * Method: getStrength
	 * @return the fierceness of the spell
	 */
	public String getStrength() 
	{
		return strength;
	}

	/**
	 * Method: getType
	 * @return the distinct category of the spell
	 */
	public String getType() 
	{
		return type;
	}

	/**
	 * Method: setName
	 * @param name the determined name of the spell
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Method: setStrength
	 * @param strength the programmed level of ferocity of the spell
	 */
	public void setStrength(String strength) 
	{
		this.strength = strength;
	}

	/**
	 * Method: setType
	 * @param type the devised category for the spell
	 */
	public void setType(String type) 
	{
		this.type = type;
	}
	
	
}
