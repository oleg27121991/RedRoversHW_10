package by.veremei.utils;

import by.veremei.stuff.Employee;
import by.veremei.stuff.Manager;

public class CompanyUtils {
    public Employee findEmployeeByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public Employee findEmployeeByPartName(Employee[] employees, String partName) {
        for (Employee employee : employees) {
            if (employee.getName().contains(partName)) {
                 return employee;
            }
        }
        return null;
    }

    public double calculateTotalSalaryBudget(Employee[] employees) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public double findMinSalary(Employee[] employees) {
        double min = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
            }
        }
        return min;
    }

    public double findMaxSalary(Employee[] employees) {
        double max = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public int findMinimumSubordinatesCount(Manager[] managers) {
        int minSubordinates = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if (minSubordinates > manager.getNumberOfSubordinates()) {
                minSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return minSubordinates;
    }

    public int findMaximumSubordinatesCount(Manager[] managers) {
        int maxSubordinates = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (maxSubordinates < managers[i].getNumberOfSubordinates()) {
                maxSubordinates = managers[i].getNumberOfSubordinates();
            }
        }
        return maxSubordinates;
    }

    public double findMaximumBonus(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        double maxBonus = managers[0].getBaseSalary() - managers[0].getSalary();
        for (Manager manager : managers) {
            double bonus = manager.getBaseSalary() - manager.getSalary();
            if (maxBonus < bonus) {
                maxBonus = bonus;
            }
        }
        return maxBonus;
    }

    public  double findMinimumBonus(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        double minBonus = managers[0].getBaseSalary() - managers[0].getSalary();
        for (Manager manager : managers) {
            double bonus = manager.getBaseSalary() - manager.getSalary();
            if (minBonus > bonus) {
                minBonus = bonus;
            }
        }
        return minBonus;
    }
}
