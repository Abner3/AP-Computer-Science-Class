public class Cheetah extends BigCat
{
    public void roar()
    {
        run();
        super.roar();
    }

    public void run() { System.out.println("Run like a Cheetah!");}

}