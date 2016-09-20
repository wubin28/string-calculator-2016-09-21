import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void the_result_of_empty_string_is_0() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void the_result_of_one_number_is_itself() {
        assertEquals(1, StringCalculator.add("1");
    }
}
