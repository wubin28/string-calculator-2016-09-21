import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void the_result_of_empty_string_is_0() {
        assertEquals(0, StringCalculator.add(""));
    }
}
