package by.tms.task2practice;

public class Employee implements Reportable {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String generateReport() {
        return String.format("|%-20s|%10.2f|", fullName, salary);
    }
}
