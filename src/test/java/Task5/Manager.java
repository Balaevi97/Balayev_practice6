package Task5;

public class Manager extends Employee {
    public String department;

    public Manager(String department, String name, double salary) {
        super(name, salary);
        this.department = department;
    }

    public void displayDetails () {
        super.displayDetails();
        System.out.println("\n Department: " + department + "\n Name: " + name + "\n Salary: " + salary);
    }

    public static void main(String[] args) {
        //   Employee employee = new Employee("Bahruz", 5000);
        Manager manager = new Manager("Quality Assurance", "Bahruz", 7000);

        //   employee.displayDetails();
        manager.displayDetails();

    }

}