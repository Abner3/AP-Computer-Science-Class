public class ParabolaTester
{
    public static void main (String [] args)
    {
        Parabola parabola1 = new Parabola(1, 3, -10);
        Parabola parabola2 = new Parabola(2, 4, -6);
        Parabola parabola3 = new Parabola(5);
        int disc = parabola2.computeDiscriminant();
        System.out.println("The discriminant is " + disc);
        System.out.println("The discriminant is " + parabola1.computeDiscriminant());
        System.out.println("a is " + parabola1.getAValue());
        System.out.println(parabola1);
        
    }
}
