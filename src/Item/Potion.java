package Item;
/**Class: Potion
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 1, 2015
 *
 *
 * This class - the second child of Item
 *
 * Purpose: - takes on the "Potion" entity
 */

/**
 * @author karl
 *
 */
public class Potion extends Item
{
	private String potionName;
	private String potionSize;
	private String potionType;
	
	/**
	 * The Potion default constructor
	 * Contains the null values of the potion's name, size and type
	 */
	public Potion()
	{
		potionName = "";
		potionSize = "";
		potionType = "";
	}
	
	/**
	 * Method: getPotionName
	 * @return the potion's unique title
	 */
	public String getPotionName()
	{
		return potionName;
	}
	
	/**
	 * Method: getPotionSize
	 * @return the size of the potion
	 */
	public String getPotionSize()
	{
		return potionSize;
	}
	
	/**
	 * Method: getPotionType
	 * @return the potion's category
	 */
	public String getPotionType()
	{
		return potionType;
	}
	
	/**
	 * Method: setPotionName
	 * @param potionName a certain title for the potion
	 */
	public void setPotionName(String potionName)
	{
		this.potionName = potionName;
	}
	
	/**
	 * Method: setPotionSize
	 * @param potionSize the new size for the potion
	 */
	public void setPotionSize(String potionSize)
	{
		this.potionSize = potionSize;
	}	
	
	/**
	 * Method: setPotionType
	 * @param potionType the unique potion type 
	 */
	public void setPotionType(String potionType)
	{
		this.potionType = potionType;
		
	}
}
