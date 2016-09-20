import java.util.List;

public class StringCalculator {
    static int add(String string, StringCalculatorParser parser) {
        List<String> numbers = parser.parse(string);
        int sum = 0;
        for (String number : numbers) {
            if (number.equals("")) {
                continue;
            }
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}

