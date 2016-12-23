public class Test
{
    double[] array1 = {10,20,30};
    int sum;
    public double sumArray(double[] nums)
    {
        for (int length = array1.length-1; length >= 0; length--)
        {
            sum += array1[length];
        }
        if (1 < sum < 10)
        return sum;

    }

    
}
