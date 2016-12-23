public class MusicalInterlude extends NonDance
{
    //length created
    private String genre, title;
    
    public MusicalInterlude()
    {
        super(0);
        this.genre = "genre";
        this.title = "title";
    }
    
    public MusicalInterlude(String genre, String title, int length) 
    {
        super(length);
        this.genre = genre;
        this.title = title;
    }
    
    public String perform()
    {
        return "MusicalInterlude-ing...";
    }
    
    public String toString()
    {
        return super.toString() + "\nGenre: " + genre + "\nTitle: " + title;
    }
}