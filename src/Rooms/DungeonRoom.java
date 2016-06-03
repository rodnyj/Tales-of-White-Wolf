package Rooms;

/**Class: DungeonRoom
 * @author Rodny Joseph
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 * 
 * This class – The DungeonRoom class has the method to generate a monster and the various percentages
 * for some rooms
 * 
 * Purpose: – This class will generate a monster for the Room that is a Dungeon implementation.
 */

public class DungeonRoom extends Room{
	
	/**
	 * generateMonster Method
	 * @param zone
	 */
	// this method generates a monster for a particular zone
	public int generateRoomMonster(int zone)
	{
		if(zone < 19)
		{
			System.out.println("Invalid number");
		}	
		else if (zone == 19)
		{
		return 0;
		}
		else if(zone == 20)
		{
			return 50;
		}
		else if(zone == 21)
		{
			return 65;
		}
		else if(zone == 22)
		{
			return 20;
		}
		else if(zone == 23)
		{
			return 45;
		}
		else if(zone == 24)
		{
			return 60;
		}
		else if(zone == 25)
		{
			return 75;
		}
		else if(zone == 26)
		{
			return 35;
		}
		else if(zone == 27)
		{
			return 70;
		}
		else if(zone == 28)
		{
			return 0;
		}
		else if(zone == 29)
		{
			return 100;
		}
		
		return 0;

	}
}
