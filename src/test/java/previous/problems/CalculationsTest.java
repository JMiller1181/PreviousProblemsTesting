package previous.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    @DisplayName("Test calculations() method")
    @Test
    void testCalculations(){
        assertEquals("""
                4 + 5 = 9
                4 - 5 = -1
                4 * 5 = 20
                4 / 5 = 0.8
                4 % 5 = 4""", Calculations.calculations(4,5));
    }
}