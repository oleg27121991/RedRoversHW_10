package by.veremei.stuff;

public class Employee {
    double baseSalary;
    String name;
    double salary;

    public Employee(double baseSalary, String name, double salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
}
