class Employee {
    private String empName;
    private double salary;

    private static String companyName = "Bright Horizon Technologies";
    private static int employeeCount = 0;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class M5Solution {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aarav", 50000);
        Employee employee2 = new Employee("Meera", 60000);
        Employee employee3 = new Employee("Kabir", 55000);

        Employee.printCompanyInfo();
    }
}
