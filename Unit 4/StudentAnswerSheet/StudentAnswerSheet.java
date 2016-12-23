import java.util.ArrayList;

public class StudentAnswerSheet
{
    //instance variables
    private ArrayList<String> answers; //the list of the student's answers
    /** other instance variables need to be added
     */
    private String studentName;
    private double score;
    //constructors
    /** constructors need to be added
     */
    public StudentAnswerSheet(ArrayList<String> answers,String name)
    {
        this.answers = answers;
        studentName = name;
    }

    //other methods
    /** @param key the list of correct answers, represented as strings of length one
     *          Precondition: key.size() is equal to the number of answers in the answer sheet
     *  @return this student's test score        
     */
    public double getScore(ArrayList<String> key)
    {
        this.computeScore(key);
        return score;
    }

    /** @return the name of the student
     */
    public String getName()
    {
        return studentName;
    }

    /** Other methods may be needed
     */

    private void computeScore(ArrayList<String> key)
    {
        double studentScore = 0;
        
        for (int k = 0; k < key.size(); k++)
        {
            if (!(answers.get(k).equals("?")))
            {
                if (answers.get(k).equals(key.get(k)) )
                {
                    studentScore += 1;
                }
                else
                {
                    studentScore -= 0.25;
                }
            }
        }
        score = studentScore;
    }
}

