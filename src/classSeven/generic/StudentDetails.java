package classSeven.generic;

public class StudentDetails<T> {
    private final T studentDetails;


    public StudentDetails(T studentDetails) {
        this.studentDetails = studentDetails;

    }

    public T getStudentDetails() {
        return studentDetails;
    }
}
