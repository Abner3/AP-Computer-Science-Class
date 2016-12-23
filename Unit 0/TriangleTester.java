public class TriangleTester
{
    public static void main (String [] args)
    {
        Triangle triangle1 = new Triangle(3, 5, 1);
        Triangle triangle2 = new Triangle(1, 2, 3);
        
        System.out.println(triangle1);
        System.out.println("Triangle 2 has sides " + triangle2.getSide1()
        + triangle2.getSide2() + triangle2.getSide3());
        
        System.out.println("\nPerimeter of triangle1 = " + triangle1.calculatePerimeter());
        System.out.println("Perimeter of triangle2 = " + triangle2.calculatePerimeter());
        
        System.out.println("\nArea of triangle1 = " + triangle1.calculatePerimeter());
        System.out.println("Area of triangle2 = " + triangle2.calculatePerimeter());
        
    }
}
