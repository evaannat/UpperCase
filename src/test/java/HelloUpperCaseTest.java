import org.junit.jupiter.api.Test;
import pl.altkom.utils.HelloUtil;

import static org.junit.jupiter.api.Assertions.*;

class HelloUpperCaseTest {

    @Test
    void helloToUpperCase() {

        // Given
        String passedArgument = "ewa";
        String expectedValue = HelloUtil.GREETING.toUpperCase() + " " + passedArgument.toUpperCase();
        // When
        String returnedValue = HelloUpperCase.helloToUpperCase(passedArgument);
        // Then
        assertEquals(expectedValue, returnedValue);
    }


}