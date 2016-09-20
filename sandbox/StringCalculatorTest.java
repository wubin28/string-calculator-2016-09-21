import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void the_result_of_empty_string_is_0() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void the_result_of_one_number_is_itself() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void the_result_of_two_numbers_separated_by_a_comma_is_the_sum_of_them() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void the_result_of_unknown_amount_of_numbers_separated_by_commas_is_the_sum_of_them() {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void should_use_newlines_between_numbers_in_addition_to_commas() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
}


