import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordVowelRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		//Change to WordLength or WordVowel
		WordVowel[] words = new WordVowel[size];
		for(int i=0; i<words.length; i++)
		{
		    //Change to WordLength or WordVowel
			words[i]=new WordVowel(file.nextLine());
		}

		Arrays.sort(words);
		//Change to WordLength or WordVowel
		for(WordVowel word : words)
		{
			out.println(word);
		}
	}
}