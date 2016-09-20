import java.util.List;

public class StringToIntParser {
    static List<String> parse(String string) {
        return Arrays.asList(string.split("\\s*,\\s*"));
    }
}