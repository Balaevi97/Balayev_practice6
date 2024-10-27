package Task5;

public class Employee {
    public String name;
    public double salary;

    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }



    public void displayDetails() {
        System.out.println("\n Name: " + name + "\n Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Jack", 5000);

        employee.displayDetails();
    }
}
