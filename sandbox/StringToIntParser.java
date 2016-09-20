import java.util.List;
import java.util.Arrays;

public class StringToIntParser {
    static List<String> parse(String string) {
        return Arrays.asList(string.split("\\s*,\\s*"));
    }
}