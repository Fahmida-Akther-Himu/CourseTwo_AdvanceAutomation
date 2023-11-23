package classSeven.nonGeneric;

public class StudentTotalMark {
    private int english, bangla, math;

    public StudentTotalMark(int english, int bangla, int math) {
        this.english = english;
        this.bangla = bangla;
        this.math = math;
    }

    public int totalMark() {
        int total = english + bangla + math;
        return total;
    }
}
