package Monster;
/**Class: Monster
 * @author Karl Kraus
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Apr 3, 2015
 *
 *
 * This class - 
 *
 * Purpose: - 
 */

/**
 * @author karl
 *
 */
public class Monster 
{
	private double health = 0.0;
	private boolean hasItem = false;
	private Item.Item i;
	private int currentDifficulty = 0;
	private String monsterName = "";
    private boolean monsterDefeated=false;
    private boolean bossMonster;
    private int monsterStrength;

    public int getMonsterStrength() {
        return monsterStrength;
    }

    public void setMonsterStrength(int monsterStrength) {
        this.monsterStrength = monsterStrength;
    }

    public Monster(double health, boolean hasItem, int cd, String monName, Item.Item item, int monsterStrength)
	{
		this.health = health;
		this.hasItem = hasItem;
		this.currentDifficulty = cd;
		this.monsterName = monName;
		this.i = item;
        this.monsterStrength = monsterStrength;
		
	}

    public boolean isBossMonster() {
        return bossMonster;
    }

    public void setBossMonster(boolean bossMonster) {
        this.bossMonster = bossMonster;
    }

    public boolean isMonsterDefeated() {

        return monsterDefeated;
    }

    public void setMonsterDefeated(boolean monsterDefeated) {
        this.monsterDefeated = monsterDefeated;
    }

    public Monster(double health1, boolean hasItem1, int cd, String monName, boolean bossMonster, int monsterStrength)
	{
		this.health = health1;
		this.hasItem = hasItem1;
		this.currentDifficulty = cd;
		this.monsterName = monName;
        this.bossMonster = bossMonster;
        this.monsterStrength = monsterStrength;

		
	}

	public double getHealth() 
	{
		return health;
	}

	public boolean isHasItem() 
	{
		return hasItem;
	}
	
	public boolean onMonsterDeath(boolean hasItem)
	{
        boolean value=false;
		this.monsterDefeated=true;
        if(hasItem)
		{
			//itemList.addItem(this.i);
            //this.i = null;
            value=true;
		}
        return value;
	}

	public int getCurrentDifficulty() 
	{
		return currentDifficulty;
	}

	public String getMonsterName() 
	{
		return monsterName;
	}

	public void setHealth(double health) 
	{
		this.health = health;
	}

	public void setHasItem(boolean hasItem) 
	{
		this.hasItem = hasItem;
	}

	public void setCurrentDifficulty(int currentDifficulty) 
	{
		this.currentDifficulty = currentDifficulty;
	}

	public void setMonsterName(String monsterName) 
	{
		this.monsterName = monsterName;
	}
	
	
}
