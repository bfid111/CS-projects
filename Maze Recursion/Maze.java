/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Youngmin
 */

class Maze {
 // maze 
 static char maze[][] =  { };
 static char maze2[][] = {
  {'#','#','#','#','#','#','#','#','#','#','#','#'},
  {'#','.','.','.','#','.','.','.','.','.','.','#'},
  {'.','.','#','.','#','.','#','#','#','#','.','#'},
  {'#','#','#','.','#','.','.','.','.','#','.','#'},
  {'#','.','.','.','.','.','#','#','.','#','.','.'},
  {'#','#','#','#','.','#','.','#','.','#','.','#'},
  {'#','.','.','#','.','#','.','#','.','#','.','#'},
  {'#','#','.','#','.','#','.','#','.','#','.','#'},
  {'#','.','.','.','.','.','.','.','.','#','.','#'},
  {'#','#','#','#','#','.','#','#','#','#','.','#'},
  {'#','.','.','.','.','.','.','#','.','.','.','#'},
  {'#','#','#','#','#','#','#','#','#','#','#','#'}
  }; // maze #2 
 static char maze1[][] = {
  {'#','#','#','#','#','#','#','#','#','#','#','#'},
  {'#','.','.','.','#','.','.','.','.','.','.','#'},
  {'.','.','#','.','#','.','#','#','#','#','.','#'},
  {'#','#','#','.','.','.','.','.','.','#','.','#'},
  {'#','.','.','.','.','#','#','#','.','#','.','#'},
  {'#','#','#','#','#','#','.','#','.','#','.','#'},
  {'#','.','.','#','.','#','.','#','.','#','.','#'},
  {'#','#','.','#','.','#','.','#','.','#','.','#'},
  {'#','.','.','.','.','.','.','.','.','#','.','#'},
  {'#','#','#','#','#','.','#','#','#','#','.','.'},
  {'#','.','.','.','.','.','.','.','#','.','.','#'},
  {'#','#','#','#','#','#','#','#','#','#','#','#'}
  }; // maze #1


 static int finalx; // exit coodrinate  variable
 static int finaly;// exit coodrinate  variable
 static long timeA, timeB, finalTime, nanoA, nanoB;
 
 /**
  * Find the path through the maze
  * PreCondition - The X and Y Coordinates has to be passed 
  * Post Condition - Leaves a trace on the maze with X and O on the EXIT
  * @return boolean
  */
 public static boolean traverseTheMaze(int x,int y) {
  System.out.println("Current Status of Maze "); 
  printMaze(); // print maze 
  if(x == finalx && y == finaly)// if reaches the exit
  {
  maze[x][y] = 'O'; // marks exit os 'O'
  return true;
  }
  if(maze[x][y] != '.') // if the next block is not open 
  
      return false;
  
   maze[x][y] = 'X'; // set passed block as X  if passable 

  if(traverseTheMaze(x-1,y) == true) // if there is a space up
  {
      return true;
  }
  if(traverseTheMaze(x,y+1) == true) // if there is a space right
  {
      return true;
  }
  if(traverseTheMaze(x+1,y) == true) // if there is a space down 
  {
      return true;
  }
  if(traverseTheMaze(x,y-1) == true) // if there is a space left
  {
      return true;
  }
  maze[x][y] = '.';

  return false;
 }
 /**
  * Prints The Maze 
  * Precondition - None
  * PostCondition - Prints the Maze to the Screen 
  */
 public static void printMaze() {
     for(int i = 0; i < maze.length; i++)
  {
   for (int j = 0; j < maze.length; j++)
   {
    System.out.print(maze[i][j] + " "); // print maze 
   }
    System.out.println();
  }
 }

 

} 