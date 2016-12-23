public class Matrix
{
    public static void main (String[] args)
    {
        int[][] mat = new int[5][3];
        Grade[][] scores = new Grade[2][5];
        
        for(Grade scores: scores)
        {
            scores = Math.random()*4;
        }
        
        for (int r=0; r<mat.length; r++)
        {
            for (int c = 0; c<mat[r].length; c++)
            {
                mat[r][c] = (int)(Math.random()*10);
            }
        }
        
        
    }
}