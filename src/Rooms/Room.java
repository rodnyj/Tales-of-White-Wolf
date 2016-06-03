package Rooms;

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
import Puzzle.Puzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Room {
	
	// "No Monsters" or "No Puzzle" or "No Items" variables 
	String noMonster = "No Monsters";
	String noPuzzle = "No Puzzles";
	String noItem = "No Items";

	
	//ArrayList of Monster Class
	List<Monster.Monster> monsterList = new ArrayList<Monster.Monster>();

	//ArrayList of Item Class
	List<Item.Item> itemList = new ArrayList<Item.Item>();
	
	//ArrayList of Puzzle Class
	List<Puzzle> puzzleList = new ArrayList<Puzzle>();

	/**
	 * addMonster Method
	 * @param m
	 */
	//Sets the puzzle name
	//Add a Monster
	public void addMonster (Monster.Monster m)
	{
		monsterList.add(m);
	}	
	
	/**
	 * addItem Method
	 * @param i
	 */
	//Sets the puzzle name
	//Add an Item
	public void addItem (Item.Item i)
	{
		itemList.add(i);
	}
	
	/**
	 * addPuzzle Method
	 * @param p
	 */
	//Sets the puzzle name
	//Add an Puzzle
	public void addPuzzle (Puzzle p)
	{
		puzzleList.add(p);
	}
	
	String moveDirection;
	double monsterSpawnChance;
	double puzzleSpawnChance;
	double itemSpawnChance;
	Random ran;

	/**
	 * setMoveDirection Method
	 * @param direction
	 */
	// sets the derection
	public void setMoveDirection (String direction)
	{
		moveDirection = direction;
	}
	
	/**
	 * getDirection Method
	 * 
	 */
	//gets  direction
	public String getDirection()
	{
		
		return moveDirection;
	}
	
	/**
	 * generateRoomMonster Method
	 * @param monsterSpawnChance
	 */
	//generate monster spawn chance
	public void generateRoomMonster(double monsterSpawnChance)
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
	public void generateRoomItems(double itemSpawnChance)
	{
		this.itemSpawnChance = itemSpawnChance;
	}
	
}
