public class main{
   public static void main(String [] args){
       ArrayList<String> array = new ArrayList<String>();
                  ArrayList<String> temp = new ArrayList<String>();
       array.add("TAN");
       array.add("ABRACADABRA");
       array.add("WHOA");
       array.add("EGGS");
       for(int i = 0; i < array.size(); i++){
           Word word = new Word(array.get(i));
           word.scrambleWord();
           temp.add(word.getWord());
       }
       
       temp.scambleOrRemove();
    }
}
