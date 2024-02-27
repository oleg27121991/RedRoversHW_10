package by.veremei.stuff;

public class Director extends Manager {
    public Director(double baseSalary, String name, double salary, int numberOfSubordinates) {
        super(baseSalary, name, salary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return salary;
        } else {
            return baseSalary * (numberOfSubordinates * 1.0 / 100 * 9);
        }
    }
}
