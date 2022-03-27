import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfAlarmFirstTest {

    @Test void countCustomers_whenLess30_shouldTrue() {
        assertTrue(IfAlarmFirst.countCustomers(29));
    }

    @Test void countCustomers_whenMore30_shouldFalse() {
        assertFalse(IfAlarmFirst.countCustomers(31));
    }

    @Test void countCustomers_when30_shouldTrue() {
        assertTrue(IfAlarmFirst.countCustomers(30));
    }
}