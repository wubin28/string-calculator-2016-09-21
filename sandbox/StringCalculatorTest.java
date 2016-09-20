import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void the_result_of_empty_string_is_0() {
        StringCalculatorParser parserWithDelimiterNewLineOrComma =
            new ParserWithDelimiterNewLineOrComma();
        assertEquals(0, StringCalculator.add("", parserWithDelimiterNewLineOrComma));
    }

    @Test
    public void the_result_of_one_number_is_itself() {
        StringCalculatorParser parserWithDelimiterNewLineOrComma =
            new ParserWithDelimiterNewLineOrComma();
        assertEquals(1, StringCalculator.add("1", parserWithDelimiterNewLineOrComma));
    }

    @Test
    public void the_result_of_two_numbers_separated_by_a_comma_is_the_sum_of_them() {
        StringCalculatorParser parserWithDelimiterNewLineOrComma =
            new ParserWithDelimiterNewLineOrComma();
        assertEquals(3, StringCalculator.add("1,2", parserWithDelimiterNewLineOrComma));
    }

    @Test
    public void the_result_of_unknown_amount_of_numbers_separated_by_commas_is_the_sum_of_them() {
        StringCalculatorParser parserWithDelimiterNewLineOrComma =
            new ParserWithDelimiterNewLineOrComma();
        assertEquals(6, StringCalculator.add("1,2,3", parserWithDelimiterNewLineOrComma));
    }

    @Test
    public void should_use_newlines_between_numbers_in_addition_to_commas() {
        StringCalculatorParser parserWithDelimiterNewLineOrComma =
            new ParserWithDelimiterNewLineOrComma();
        assertEquals(6, StringCalculator.add("1\n2,3", parserWithDelimiterNewLineOrComma));
    }

    @Test
    public void should_use_different_delimiters() {
        StringCalculatorParser parserWithCustomizedDelimiter = 
            new ParserWithCustomizedDelimiter();
        assertEquals(3, StringCalculator.add("//;\n1;2", parserWithCustomizedDelimiter));
    }
}


