import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {

        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);

        employee.punchIn(10);

        assertEquals(10, employee.getStartTime());
        assertTrue(employee.isWorking());
    }

    @Test
    void punchOut() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);

        employee.punchIn(10);
        employee.punchOut(20);

        //Check for endTime = expected. Check for total hours
        Assertions.assertEquals(20, employee.getEndTime());
        Assertions.assertEquals(10, employee.getHoursWorked());
        assertFalse(employee.isWorking);
    }
}