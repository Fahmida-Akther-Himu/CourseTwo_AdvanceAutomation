package classSix.abstraction;

public class EnglishSubject extends Subjects {
    @Override
    public void subName() {
        System.out.println("English");
    }

    @Override
    public void subDetails() {
        System.out.println("This is an English subject.");
    }

    @Override
    public void subMark() {
        super.subMark();
    }
}
