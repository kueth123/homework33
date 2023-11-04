public class Student extends Person {
    private String classroom;

    public Student(int age, String classroom) {
        super(age);
        this.classroom = classroom;
    }

    public Student(int age, boolean parentPermission, String name, String classroom) {
        super(age, parentPermission, name);
        this.classroom = classroom;
    }
}