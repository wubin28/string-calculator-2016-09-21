import java.util.List;

public class StringCalculator {
    static int add(String string) {
        List<String> numbers = StringToIntParser.parse(string);
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
    }
}

