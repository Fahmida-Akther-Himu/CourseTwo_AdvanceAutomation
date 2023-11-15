package classSeven.nonGeneric;

import java.util.Arrays;

public class StudentTest
{
    public static void main(String[] args) {
        StudentName studentName= new StudentName("Fahmida");
        System.out.println("Student Name - "+studentName.getStudentName());

        StudentGpa studentGPA= new StudentGpa(3.50);
        System.out.println("Student GPA - "+studentGPA.getCgpa());

        StudentRoll studentRoll=new StudentRoll(50);
        System.out.println("Student roll -"+studentRoll.getStudentRoll());

        StudentTotalMark studentTotalMark= new StudentTotalMark(80,90,100);
        System.out.println("Total mark - "+studentTotalMark.totalMark());

        StudentSubjectList studentSubjectList=new StudentSubjectList(new String[]{"english", "bangla", "math"});
        System.out.println("Subject list -"+Arrays.toString(studentSubjectList.getSubjects()));








    }
}
