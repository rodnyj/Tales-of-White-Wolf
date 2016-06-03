package Rooms;

/**Class: CityRoom
 * @author Rodny Joseph
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 * 
 * This class – The CityRoom class has the method to generate a monster
 * 
 * Purpose: – This class will generate a monster for the Room that is a City implementation.
 */
public class CityRoom extends Room 
{
	/**
	 * generateRoomMonster Method
	 * @param zone
	 */
	//Generates monster and assigning it a percentage for a particular zone
	
	public int generateRoomMosnter(int zone)
	{
		if(zone == 4 || zone == 5)
		{
		return 10;
		}
		else
			return 0;
	}
	
}