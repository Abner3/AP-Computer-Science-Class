public class StudentRecordTester
{
    
    public static void main(String[] args)
    {
        
        int[] scores1={50,50,20,80,53};
        int[] scores2={20,50,50,53,80};
        int[] scores3={20,50,50,80};
        
        StudentRecord student1 = new StudentRecord(scores1);
        StudentRecord student2 = new StudentRecord(scores2);
        StudentRecord student3 = new StudentRecord(scores3);
        
        System.out.println(student1.finalAverage());  //should be 50.6
        System.out.println(student2.finalAverage());  //should be 61.0
        System.out.println(student3.finalAverage());  //should be 65.0
    }
}
