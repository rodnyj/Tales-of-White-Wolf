package Puzzle;

/**Class: MultipleDoorPuzzle
 * @author Rodny Joseph
 * @version 1.0
 * Course : ITEC 3860 Spring 2015
 * Written: April 1 2015
 *
 * This class � This class has the methods to generate a puzzle with multiple doors.
 *
 * Purpose: � be a super class to all puzzles
 */
public class Puzzle
{
    private String puzzleName;

    private boolean isSolved;

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public String getPuzzleName() {
        return puzzleName;
    }

    public void setPuzzleName(String puzzleName) {
        this.puzzleName = puzzleName;
    }
}
