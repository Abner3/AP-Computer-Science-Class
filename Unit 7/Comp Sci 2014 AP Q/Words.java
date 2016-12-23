import java.util.*;
public class Words{
    private String word;

    public Words(String word){
        this.word = word;
    }

    public static String scrambleWord(String word){
        char temp = ' ';
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'A' && i + 1 < word.length()){
                temp = word.charAt(i+1);
                word = word.substring(0, i) + temp + 'A' + word.substring(i + 2);
                i++;
            }
        }
        return word;
    }
    
    public ArrayList<String> scrambleOrRemove(ArrayList<String> wordList){
        ArrayList<String> temp = new ArrayList<String>();
        for (String word1: wordList){
            for(int i = 0; i < word1.length(); i++){
                if(word1.charAt(i) == 'A'){
                    temp.add(word1);
                    break;
                }
            }
        }
        return temp;
    }
}
