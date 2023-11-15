package classFive.inheritance;

public class Teacher extends University {
    public String course;


    public Teacher() {
        super();
        this.course = course;
    }

    public void takeCourse() {
        System.out.println("A teacher can take five courses.");
    }

    public void getSalary() {
        System.out.println("Each teacher gets 50,000 BDT per month.");
    }


}
