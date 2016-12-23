import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("maze.dat"));
		while(file.hasNext())
		{
			int size = file.nextInt();
			file.nextLine();
			Maze test = new Maze(size, file.nextLine());
			test.toStringArray();
			test.checkForExitPath(0,0);
			out.println(test);
		}
	}
}
