package alfi120423;

public class Employee extends Person {
    @Override
    public String getName() {
        System.out.println("getName Employee");
        return name;
    }
}
