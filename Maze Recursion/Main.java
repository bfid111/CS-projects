/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Youngmin
 */

public class Main {
    static int x; // coordinate variable
    static int y; // coordinate variable
    static long msA;
    static long msB;
    static long nsA;
    static long nsB;
    static Scanner sc = new Scanner(System.in);
    /**
     * Prompts the User to Select a Maze to Solve
     * PreCondition - User has to ENTER 1 or 2 to solve a maze
     * PostCondition - Solves the Selected Maze and prints it to the Console 
     * 
     * @throws IOException 
     */
    public static void main(String [] Args) throws IOException {
    System.out.println("WELCOME TO MAZE SOLVER");
    System.out.println("MAZE#1");
    Maze.maze = Maze.maze1;
    Maze.printMaze();
    System.out.println("______________________________________________________________");
    Maze.maze = Maze.maze2;
    System.out.println("MAZE#2");
    System.out.println("______________________________________________________________");
    Maze.printMaze();
    System.out.print("ENTER 1 TO SOLVE MAZE #1, ENTER 2 TO SOLVE MAZE #2 : ");
    int sel = sc.nextInt();
    System.out.println();
    if(sel == 1) // if user enters 1
    {
     
        System.out.println("MAZE#1 WAS SELECTED");
        Maze.maze = Maze.maze1;
        Maze.finalx = 9; // coordinate of exit  of the maze
        Maze.finaly = 11;
        msA = System.currentTimeMillis();
        Maze.traverseTheMaze(2,0); // starting coordinate
        msB = System.currentTimeMillis() - msA;
    }
    else  // if user enters 2
    {
       
        System.out.println("MAZE#2 WAS SELECTED");
        Maze.maze = Maze.maze2;
        Maze.finalx = 4; // coordinate of exit of the maze
        Maze.finaly = 11;
        msA = System.currentTimeMillis();
        Maze.traverseTheMaze(2,0); // starting coordinate
        msB = System.currentTimeMillis() - msA;
    }
    
    System.out.println();
    System.out.println("______________________________________________________________");
    System.out.println("Maze Solved!");
    Maze.printMaze();
    System.out.println("______________________________________________________________");
    System.out.println("TIME TOOK : " + msB + " ms");
    
 
 }
    
}
