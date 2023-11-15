package classSeven.generic;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {

        StudentDetails<String> studentName = new StudentDetails<>("Fahmida Akther");
        System.out.println(studentName.getStudentDetails());

        StudentDetails<Integer> studentRoll = new StudentDetails<>(78);
        System.out.println(studentRoll.getStudentDetails());

        StudentDetails<Double> studentGPA = new StudentDetails<>(3.8);
        System.out.println(studentGPA.getStudentDetails());

        StudentDetails<String[]> studentSubjectList = new StudentDetails<>(new String[]{"english", "bangla", "math"});
        System.out.println(Arrays.toString(studentSubjectList.getStudentDetails()));

        StudentDetails<Boolean> StudentAttendents = new StudentDetails<>(true);
        if (StudentAttendents.getStudentDetails() == true) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }


    }
}
