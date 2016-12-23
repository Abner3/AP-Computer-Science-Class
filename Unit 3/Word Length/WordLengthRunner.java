import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordLengthRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		
		//Change to WordLength or WordVowel
		WordLength[] words = new WordLength[size];
		for(int i=0; i<words.length; i++)
		{
		    //Change to WordLength or WordVowel
			words[i]=new WordLength(file.nextLine());
		}

		Arrays.sort(words);
		//Change to WordLength or WordVowel
		for(WordLength word : words)
		{
			out.println(word);
		}
	}
}