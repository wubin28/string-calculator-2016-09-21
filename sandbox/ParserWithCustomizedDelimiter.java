import java.util.List;
import java.util.Arrays;

public class ParserWithCustomizedDelimiter implements StringCalculatorParser {
    @Override
    public List<String> parse(String string) {
        return Arrays.asList(string.substring(4).split("\\s*" + string.substring(2, 3) + "\\s*"));
    }
}