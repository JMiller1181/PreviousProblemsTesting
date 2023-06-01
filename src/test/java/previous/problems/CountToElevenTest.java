package previous.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountToElevenTest {
    @DisplayName("Test countToEleven() method")
    @Test
    void countToElevenTest(){
        assertEquals("5 6 7 8 9 10 11 ", CountToEleven.countToEleven(5));
    }
}