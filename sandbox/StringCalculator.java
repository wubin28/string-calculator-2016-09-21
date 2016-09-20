public class StringCalculator {
    static int add(String string) {
        List<int> numbers = StringToIntParser.parse(string);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
    }
}

