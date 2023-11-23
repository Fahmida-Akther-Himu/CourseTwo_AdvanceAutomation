package classFive.inheritance;

public class HierarchicalTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.payInformation();
        employee.print();
        employee.access();
        System.out.println("\n");
        Teacher teacher = new Teacher();
        teacher.takeCourse();
        teacher.getSalary();
        teacher.print();
        teacher.access();

    }
}
