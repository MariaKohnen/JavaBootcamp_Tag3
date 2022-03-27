import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfAlarmSecondTest {

    @Test void countCustomers_whenRedLessZero_shouldTrue() {
        assertTrue(IfAlarmSecond.countCustomers(-1, "rot"));
    }

    @Test void countCustomers_whenRedHigherZero_shouldFalse() {
        assertFalse(IfAlarmSecond.countCustomers(10, "rot"));
    }

    @Test void countCustomers_whenYellowLess30_shouldTrue() {
        assertTrue(IfAlarmSecond.countCustomers(29, "gelb"));
    }

    @Test void countCustomers_whenYellowHigher30_shouldFalse() {
        assertFalse(IfAlarmSecond.countCustomers(40, "gelb"));
    }

    @Test void countCustomers_whenGreenLess60_shouldTrue() {
        assertTrue(IfAlarmSecond.countCustomers(29, "grün"));
    }

    @Test void countCustomers_whenGreenHigher60_shouldFalse() {
        assertFalse(IfAlarmSecond.countCustomers(70, "grün"));
    }

}