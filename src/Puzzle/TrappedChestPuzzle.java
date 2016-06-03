package Puzzle;


import java.util.Random;

/**Class: TrappedChestPuzzle
 * @author Rodny Joseph
 * @version 1.0
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 *
 * This class � This class has the methods to generate rooms and keys for a puzzle
 *
 * Purpose: � This class will be a puzzle that user can choose between keys and the right key
 * opens correct door
 */
public class TrappedChestPuzzle extends Puzzle
{
    Random rand = new Random();
    private int count;
    private String bothRight = null;
    private String bothLeft = null;
    private String rightLeft = null;
    private String leftRight = null;

    public void setKey(String key)
    {
        if(key.equalsIgnoreCase("Both Right"))
        {
            bothRight = key;
        }
        else if(key.equalsIgnoreCase("Both left"))
        {
            bothLeft = key;
        }
        else if(key.equalsIgnoreCase("Left Right"))
        {
            leftRight = key;
        }
        else if(key.equalsIgnoreCase("Right LEft"))
        {
            rightLeft = key;
        }
    }

    public String getKey()
    {
        count = 1 + rand.nextInt(4);
        if(bothRight == null)
        {
            return bothRight;
        }
        else
        {
            return "Try Again:";
        }
    }



}
