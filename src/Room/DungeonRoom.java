package Room;

import java.util.ArrayList;
import java.util.Map;

/**Class: DungeonRoom
 * @author Rodny Joseph
 * @version 1.0
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 *
 * This class � The DungeonRoom class has the method to generate a monster and the various percentages
 * for some rooms
 *
 * Purpose: � This class will generate a monster for the Room that is a Dungeon implementation.
 */

public class DungeonRoom extends Room {


    public DungeonRoom(int  roomNumber, String roomDescription, String type, Map<String, Integer> map, int monster)
    {
        super(roomNumber, roomDescription, type, map, monster);

    }



}
