package Puzzle;

import java.util.Random;
import java.util.Scanner;


public class MultipleDoorPuzzle extends Puzzle
{
    Random rand;
    Scanner scan;

    public void emptyRoom()
    {
        rand = new Random();
        scan = new Scanner(System.in);

        int count = 1 + rand.nextInt(6);
        System.out.println("There are 6 doors. 5 of the doors are empty/fake. One is real "
                + "and will lead to an exit. Choose a room from 1 through 6.");
        int input = scan.nextInt();
        while(count != input)
        {
            System.out.println("Fake Door. Try Again.");
            input = scan.nextInt();
        }
        System.out.println("Correct Door. You may now leave the room.");
    }
}
