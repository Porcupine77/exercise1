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
        
        Student[] studentList = new Student[5];
        
        studentList[0] = s1;
        studentList[1] = new Student(2, "Preet");
        studentList[2] = new Student(3, "Rai");
        studentList[3] = new Student(4, "hey");
        studentList[4] = new Student(5, "hello");
        
        for(int i = 0; i<studentList.length; i++)
        {
            System.out.println(studentList[i].getsName());
        }    
    }//end of main
}//end of class
