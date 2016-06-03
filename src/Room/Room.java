package Room;
/**Class: Room
 * @author Rodny Joseph
 * @version 1.0
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 *
 * This class � The Room class contains methods that sets directions, add to Arraylists and generate
 * and object for the other classes
 *
 * Purpose: � This class will have the items, monsters, puzzles, and other object that the
 * rooms will contain.
 */

import Item.Item;
import Monster.Monster;
import Puzzle.Puzzle;
import java.util.*;


public class Room
{
    // "No Monsters" or "No Puzzle" or "No Items" variables
    private String noMonster = "No Monsters";
    private String noPuzzle = "No Puzzles";
    private String noItem = "No Items";


    private int roomNumber;
    private Set<String> directions;
    private String moveDirection;
    private String roomDescription;
    private int monsterSpawnChance;
    private double puzzleSpawnChance;
    private double itemSpawnChance;
    Random ran;
    private boolean visited;
    private String type;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    private Map<String, Integer> roomDirectionMap = new HashMap<String, Integer>() ;

    private List<Monster> monsterList = new ArrayList<Monster>();

    private HashMap<String, Item> itemList= new HashMap<String,  Item>();

    private List<Puzzle> puzzleList = new ArrayList<Puzzle>();

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Set<String> getDirections() {
        return directions;
    }

    public void setDirections(Set<String> directions) {
        this.directions = directions;
    }

    public String getValidDirections()
    {
        String value = " ";
        for(String element: directions)
        {
            value = value + " " + element + ", ";
        }

        return value;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public List<Monster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public HashMap<String, Item> getItemList() {
        return itemList;
    }

    public void setItemList(HashMap<String, Item> itemList) {
        this.itemList = itemList;
    }

    public List<Puzzle> getPuzzleList() {
        return puzzleList;
    }

    public void setPuzzleList(List<Puzzle> puzzleList) {
        this.puzzleList = puzzleList;
    }

    public Map<String, Integer> getRoomDirectionMap() {
        return roomDirectionMap;
    }

    public void setRoomDirectionMap(Map<String, Integer> roomDirectionMap) {
        this.roomDirectionMap = roomDirectionMap;
    }

    public Room(int  roomNumber, String roomDescription, String type, Map<String, Integer> map, int monsterSpawnChance)
    {

        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.roomDirectionMap.putAll(map);
        this.directions = map.keySet();
        this.monsterSpawnChance = monsterSpawnChance;
        this.type = type;






    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Room(int  roomNumber, String roomDescription, String type, Map<String, Integer> map, int monsterSpawnChance, Monster monster)
    {

        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.roomDirectionMap.putAll(map);
        this.directions = map.keySet();
        this.monsterSpawnChance = monsterSpawnChance;
        this.monsterList.add(monster);
        this.type=type;







    }
    /**
     * addMonster Method
     * @param monster
     */
    //Sets the puzzle name
    //Add a Monster
    public void addMonster (Monster monster)
    {
        monsterList.add(monster);
    }

    /**
     * addItem Method
     * @param item
     */
    //Sets the puzzle name
    //Add an Item
    public void addItem (Item item)
    {
        itemList.put(item.getItemName(), item);
    }

    /**
     * addPuzzle Method
     * @param puzzle
     */
    //Sets the puzzle name
    //Add an Puzzle
    public void addPuzzle(Puzzle puzzle)

    {
        puzzleList.add(puzzle);
    }

    /**
     * getDirection Method
     *
     */
     //gets  direction
    public String getMoveDirection()
    {
        return moveDirection;
    }

    /**
     * setMoveDirection Method
     * @param moveDirection
     */
    // sets the direction
    public void setMoveDirection(String moveDirection)
    {
        this.moveDirection = moveDirection;
    }


    public int getMonsterSpawnChance()
    {
        return monsterSpawnChance;
    }

    public void setMonsterSpawnChance(int monsterSpawnChance)
    {
        this.monsterSpawnChance = monsterSpawnChance;
    }

    public double getPuzzleSpawnChance()
    {
        return puzzleSpawnChance;
    }

    public void setPuzzleSpawnChance(double puzzleSpawnChance)
    {
        this.puzzleSpawnChance = puzzleSpawnChance;
    }

    public double getItemSpawnChance()
    {
        return itemSpawnChance;
    }

    public void setItemSpawnChance(double itemSpawnChance)
    {
        this.itemSpawnChance = itemSpawnChance;
    }

    /**
     * generateRoomMonster Method
     * @param monsterSpawnChance
     */
    //generate monster spawn chance
    public void generateRoomMonster(int monsterSpawnChance)
    {
        this.monsterSpawnChance = monsterSpawnChance;
    }

    /**
     * generateRoomPuzzle Method
     * @param puzzleSpawnChance
     */
    //generate Puzzle spawn chance
    public void generateRoomPuzzle(double puzzleSpawnChance)
    {
        this.puzzleSpawnChance = puzzleSpawnChance;
    }

    /**
     * generateRoomItem Method
     * @param itemSpawnChance
     */
    //generate Item spawn chance
    public void generateRoomItem(double itemSpawnChance)
    {
        this.itemSpawnChance = itemSpawnChance;
    }
}