import java.util.ArrayList;

public class TesterPolygon
{
    public static void main (String[] args)
    {
        Polygon rec = new Rectangle(2,5);
        Polygon sqr = new Square(7);
        Polygon tri = new Triangle(5,3);
        
        ArrayList<Polygon> figures = new ArrayList<Polygon>();
        
        figures.add(rec);
        figures.add(sqr);
        figures.add(tri);
        
        for (Polygon shape : figures)
        {
            System.out.println(shape);
        }
        
    }
}
