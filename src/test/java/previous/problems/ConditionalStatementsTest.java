package previous.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalStatementsTest {
    @DisplayName("Test sameOrNot() method for true value")
    @Test
    void sameOrNotTrueTest(){
        assertTrue(ConditionalStatements.sameOrNot("test", "test"));
    }
    @DisplayName("Test sameOrNot() method for false value")
    @Test
    void sameOrNotFalseTest(){
        assertFalse(ConditionalStatements.sameOrNot("test", "case"));
    }
}