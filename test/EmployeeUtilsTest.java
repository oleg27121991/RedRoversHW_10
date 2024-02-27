import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import by.veremei.stuff.Employee;
import by.veremei.stuff.Manager;
import by.veremei.utils.CompanyUtils;
import org.junit.Before;
import org.junit.Test;

public class EmployeeUtilsTest {
    private Employee[] employees;
    private Manager[] managers;
    CompanyUtils companyUtils = new CompanyUtils();

    @Before
    public void setUp() {
        employees = new Employee[]{
                new Employee(1000, "John", 2000),
                new Employee(1500, "Alice", 3000),
                new Employee(1200, "Bob", 2500)
        };

        managers = new Manager[]{
                new Manager(2000, "Mike", 2000, 1),
                new Manager(1800, "Jane", 1800, 2),
                new Manager(2500, "Chris", 2500, 0)
        };
    }

    @Test
    public void testFindEmployeeByName() {
        assertEquals("Alice", companyUtils.findEmployeeByName(employees, "Alice").getName());
        assertNull(companyUtils.findEmployeeByName(employees, "Unknown"));
    }

    @Test
    public void testFindEmployeeBySubstring() {
        assertEquals("John", companyUtils.findEmployeeByPartName(employees, "o").getName());
    }

    @Test
    public void testCalculateTotalSalaryBudget() {
        assertEquals(7500.0, companyUtils.calculateTotalSalaryBudget(employees), 0.01);
    }

    @Test
    public void testFindMinimumSalary() {
        assertEquals(2000.0, companyUtils.findMinSalary(employees), 0.01);
    }

    @Test
    public void testFindMaximumSalary() {
        assertEquals(3000.0, companyUtils.findMaxSalary(employees), 0.01);
    }

    @Test
    public void testFindMinimumSubordinatesCount() {
        assertEquals(0, companyUtils.findMinimumSubordinatesCount(managers));
    }

    @Test
    public void testFindMaximumSubordinatesCount() {
        assertEquals(3, companyUtils.findMaximumSubordinatesCount(managers));
    }

    @Test
    public void testFindMaximumBonus() {
        assertEquals(1940.0, companyUtils.findMaximumBonus(managers), 0.01);
    }

    @Test
    public void testFindMinimumBonus() {
        assertEquals(0.0, companyUtils.findMinimumBonus(managers), 0.01);
    }
}
