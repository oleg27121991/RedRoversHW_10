package by.veremei.stuff;

public class Manager extends Worker {
    int numberOfSubordinates;
    public Manager(double baseSalary, String name, double salary, int numberOfSubordinates) {
        super(baseSalary, name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return salary;
        } else {
            return baseSalary * (numberOfSubordinates * 1.0 / 100 * 3);
        }
    }
}
