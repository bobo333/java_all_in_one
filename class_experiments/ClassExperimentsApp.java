public class ClassExperimentsApp {
    public static void main(String[] args) {
        Object emp = new Employee("Martinez", "Anthony");
        System.out.println(emp.toString());

        System.out.println("emp class is " + emp.getClass());
    }
}

class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}