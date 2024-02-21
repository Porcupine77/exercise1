package arraydemoweek1;

/**
 *
 * @author amanp
 */
public class studentList
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1, "Aman");
        
        Student[] studentList = new Student[3];
        
        studentList[0] = s1;
        studentList[1] = new Student(2, "Preet");
        studentList[2] = new Student(3, "Rai");
        
        for(int i = 0; i<studentList.length; i++)
        {
            System.out.println(studentList[i].getsName());
        }    
    }//end of main
}//end of class
