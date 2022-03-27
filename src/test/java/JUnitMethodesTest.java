import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitMethodesTest {

    @Test
    void calculateSum_shouldReturn30() {
        assertEquals(30, JUnitMethodes.calculateSum(25, 5));
    }

    @Test
    void isGreaterThan_whenGreater100_shouldReturnTrue() {
        assertTrue(JUnitMethodes.isGreaterThan100(110));
    }

    @Test
    void isLowerThan_whenLower100_shouldReturnFalse() {
        assertFalse(JUnitMethodes.isGreaterThan100(10));
        assertFalse(JUnitMethodes.isGreaterThan100(100));
        assertFalse(JUnitMethodes.isGreaterThan100(0));
    }

}