public class StringCalculator {
    static int add(String string) {
        if (string.length() > 0) {
            return Integer.parseInt(string);
        }
        return 0;
    }
}