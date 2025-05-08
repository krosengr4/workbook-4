import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    //region testing punchIn()
    @Test
    void punchIn() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);
        employee.punchIn(10);

        assertFalse(employee.punchIn(10));
    }

    @Test
    void punchIn_time_LessThan24() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);
        boolean isLessThan24 = employee.punchIn(24);

        assertFalse(isLessThan24);
    }

    @Test
    void punchIn_time_MoreThan0() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);
        boolean isMoreThan0 = employee.punchIn(0);

        assertFalse(isMoreThan0);
    }
    //endregion

    //region testing punchOut()
    @Test
    void punchOut() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);
        boolean canPunchOut = employee.punchOut(20);

        assertFalse(canPunchOut);
    }

    @Test
    void totalHours() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);
        employee.punchIn(10);
        employee.punchOut(23);

        assertEquals(23-10, employee.getTotalHours());
    }

    @Test
    void punchOut_time_lessThan24() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);
        employee.punchIn(0);
        boolean isLessThan24 = employee.punchOut(24);

        assertFalse(isLessThan24);
    }

    @Test
    void punchOut_time_moreThan0() {
        Employee employee = new Employee(1234, "Million", "Front desk", 18.75);
        employee.punchIn(9);
        boolean isMoreThan0 = employee.punchOut(0);

        assertFalse(isMoreThan0);
    }
}