package by.veremei.stuff;

public class Worker extends Employee {
    public Worker(double baseSalary, String name, double salary) {
        super(baseSalary, name, salary);
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}
