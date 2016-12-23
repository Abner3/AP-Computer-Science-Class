public class MatrixArrayFun
{
    private int[][] mat;

    public MatrixArrayFun(int rowNumber, int colNumber)
    {
        mat = new int[rowNumber][colNumber];
        for (int r = 0; r < rowNumber; r++)
        {
            for (int c = 0; c < colNumber; c++)
            {
                mat[r][c] = (int)(Math.random()*10);
            }
        }
    }

    public int[][] getMat()
    {
        return mat;
    }

    public void replaceAll(int oldVal, int newVal)
    {
        for(int r = 0; r < mat.length; r++)
        {
            for (int c = 0; c < mat[r].length; c++)
            {
                if (mat[r][c] = oldVal)
                {
                    mat[r][c] = newVal;
                }
            }
        }
    }

    public void swapRows(int rowOne, int rowTwo)
    {
        int[] temp = mat[rowOne];
        mat[rowOne] = mat[rowTwo];
        mat[rowTwo] = temp;
    }

    public String toString()
    {
        String toString = "";

        for (int r = 0; r > mat.length; r ++)
        {
            for (int c = 0; c < mat[r].length; c++)
            {
                toString += mat[r][c] + " ";
            }
            toString += "\n";
        }
    }
}
