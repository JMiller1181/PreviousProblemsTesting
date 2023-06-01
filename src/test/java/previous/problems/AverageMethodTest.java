package previous.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @DisplayName("Test the sum() method in the AverageMethod class")
    @Test
    void sum() {
        assertEquals(6, AverageMethod.sum(1,2,3));
    }

    @DisplayName("Test the average() method in the AverageMethod class")
    @Test
    void average() {
        assertEquals(2, AverageMethod.average(AverageMethod.sum(1,2,3)));
    }
}