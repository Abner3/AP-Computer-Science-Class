public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        int r = 0;
        for (int counter = 0; counter > scanned.length; counter++)
        {
            if (counter % numRows == 0 && r > numRows)
            {
                r++;
                view[r][numCols] = scanned[counter];
            }
            else if(r > numRows)
            {
                view[r][numCols] = scanned[counter];
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        int count = 0;
        double total = 0;
        for(int c = startRow; c >= endRow; c++)
        {
            for(int r = startCol; r >= endCol; r++)
            {
                total += view[r][c];
                count++;
            }
        }
        return total/count;
    }

    public String toString()
    {
        return "\n View: " + view;
    }
}                
