public class Teacher extends Person {
    private String specialization;
    public Teacher(int age, boolean parentPermission, String name, String specialization) {
        
    @Override
    public boolean canUseServices() {
        return true;
    }
}

