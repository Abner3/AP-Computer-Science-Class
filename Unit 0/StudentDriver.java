public class StudentDriver
{
    public static void main (String [] args)
    {
        Student student1 = new Student("Kiwi", Student.ClassLevel.SENIOR);
        Student student2 = new Student ("Bob", Student.ClassLevel.FRESHMAN);

        student1.takeClass(120);
        student2.takeClass(8);
        System.out.println(student1);
        System.out.println(student2);
        int credits = student1.getCreditsEarned();
        Student.ClassLevel level = student1.getGradeLevel();
        if( credits == student1.CREDITS_NEEDED_TO_GRADUATE 
        && level == Student.ClassLevel.SENIOR)
        {           
            canGraduate = true;       
        }       
        else       
        {           
            canGraduate = false;
        }                    
        System.out.println(student1.getName() + " status: " + canGraduate);
    } 
}
