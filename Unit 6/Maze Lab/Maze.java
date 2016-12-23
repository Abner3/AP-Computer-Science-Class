import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
    //instance variables
    private int[][] maze;
    private boolean exitFound;
    private int size;
    //constructors
    public Maze()
    {
        exitFound = false;
        maze = new int[0][0];
    }

    public Maze(int size, String line)
    {
        exitFound=false;
        maze = new int[size][size];
        this.size = size;
        int spot=0;
        //out.println(line);
        for(int r = 0; r < maze.length; r++)
        {
            for(int c = 0 ; c < maze[r].length; c++)
            {
                maze[r][c]=(line.charAt(spot*2)-48);
                spot++;
            }
        }
    }
    
    //other methods
    public void checkForExitPath(int r, int c)
    {
        if(r == 0 && c == 0)
        {
            maze[r][c] = 7;
            checkForExitPath(r+1,c);
            checkForExitPath(r,c+1);
        }
        else if(maze[r][c] != 0 && r < maze.length-1 && c < maze[r].length-1 && r > 0 && c >0)
        {
            checkForExitPath(r+1,c);
            checkForExitPath(r,c+1);
            checkForExitPath(r-1,c);
            checkForExitPath(r,c-1);
        }
        else
        {
            maze[r][c] = 5;
        }
    }

    /*public String toString()
    {
        return "\nMaze: " + toStringArray(maze) + "\nExit Found: " + exitFound;
    }*/
    
    public void toStringArray()
    {   
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                //print += maze[r][c];
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}
