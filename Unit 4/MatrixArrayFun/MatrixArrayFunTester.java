public class MatrixArrayFunTester
{

    public static void main(String[] args)
    {
        MatrixArrayFun myMatrix = new MatrixArrayFun(5,6);
        
        System.out.println(myMatrix);
        
        myMatrix.swapRows(2,4);
        
        System.out.println(myMatrix);
        
        myMatrix.replaceAll(0, 1000000);
        
        System.out.println(myMatrix);
        
        System.out.println(countIt(myMatrix.getMat(), 5));
        
        System.out.println(countOdds(myMatrix.getMat()));
        
    }
    
    public static int countIt(int[][] mat, int val)
    {
        int count = 0;
        for(int[] row : mat)
        {
            for(int entry : mat[])
            {
                if(entry == val)
                {
                    count++;
                }
            }
        }
    }
    
    public static int countOdds(int[][] mat)
    {
       
        
    }
    
    
    
}

