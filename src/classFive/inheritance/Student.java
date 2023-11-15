package classFive.inheritance;

public class Student extends Teacher {
    public String name;
    public String passingYear;
    private String result;

    public Student() {

    }

    public void read() {
        System.out.println("Students study in university. ");

    }

    public void play() {
        System.out.println("Students play in university. ");

    }


}