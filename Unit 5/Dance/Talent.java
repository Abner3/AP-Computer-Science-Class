public class Talent
{
    private String talent, name, biography;
    
    public Talent(String talent, String name, String biography)
    {
        this.talent = talent;
        this.name = name;
        this.biography = biography;
    }
    
    public String toString()
    {
        return "\nTalent: " + talent + "\nName: " + name + "\nBiography: " + biography;
    }
}