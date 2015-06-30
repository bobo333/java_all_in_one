class OverrideEqualsApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Martinez", "Anthony");
        Employee emp2 = new Employee("Martinez", "Anthony");

        if (emp1.equals(null))
            System.out.println("Null, Same");
        else
            System.out.println("Null, Different");

        if (emp1.equals(emp2))
            System.out.println("emp2, Same");
        else
            System.out.println("emp2, Different");
    }
}

class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Employee emp = (Employee) obj;
        return this.lastName.equals(emp.getLastName()) && this.firstName.equals(emp.getFirstName());
    }
}