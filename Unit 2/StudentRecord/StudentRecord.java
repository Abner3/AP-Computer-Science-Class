public class StudentRecord
{
    private int[] scores;

    public StudentRecord(int[] scores)
    {
        this.scores = scores;
    }

    private double average(int first, int last)
    {
        double totalNum = 0;
        for (int counter = first; counter <= last; counter++)
        {
            totalNum += scores[counter];
        }

        return totalNum/last-first+1;
    }

    private boolean hasImproved()
    {
        for (int counter = 1; counter < scores.length; counter++)
        {
            if (scores[counter] < scores[counter-1])
                return false;
        }
        return true;
    }

    public double finalAverage()
    {
        int numScores = this.scores.length;
        if (this.hasImproved())
        {
            return this.average(numScores/2, numScores-1);
        }
        else 
        {
            return this.average(0, numScores-1);
        }
        
        /*
        if (hasImproved())
        {
            return last-average(int first, int last)/2;
            //pass halfway point to end for average
        }

        else
        {
            return average(int first,int last);
            //average(int first, int last);
        }
        */
    }
}
