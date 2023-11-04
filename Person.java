public class Person {
    private int id;
    private String name;
    private int age;
    boolean parentPermission;
    public Person(int age, boolean parentPermission, String name) {
        this.age = age;
        this.name = name;
        this.id = 0; // Set id to a default value
    }

    public Person(int age) {
        this(age, true, "Unknown"); // Use default values for name and parentPermission
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean ofAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return ofAge() || parentPermission;
    }
}