package Puzzle;


import java.util.Random;

/**Class: RiddlePuzzle
 * @author Rodny Joseph
 * @version 1.0
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 *
 * This class � This class has the methods to generate a riddle.
 *
 * Purpose: � This class generate a riddle that the user will have to solve to continue
 */

public class RiddlePuzzle extends Puzzle
{
    private String riddleAnswer;
    private String generateRiddle;

    int count = 0;
    String[] riddles;

    Random rand;

    public void setArray()
    {
        rand = new Random();
        riddles = new String[4];
        riddles[0] = "What Can You Catch But Not Throw?";
        riddles[1] = "What starts with the letter 't', is filled with 't' and ends in 't'?";
        riddles[2] = "What has hands but can not clap?";
        riddles[3] = "We see it once in a year, twice in a week, and never in a day. What is it?";

        count = rand.nextInt(riddles.length);
        generateRiddle = riddles[count];

    }







}
