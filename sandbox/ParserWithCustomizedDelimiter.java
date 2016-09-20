import java.util.List;

public class ParserWithCustomizedDelimiter implements StringCalculatorParser {
    @Override
    List<String> parse(String string) {
        return Arrays.asList(string.substring(4).split("\\s*" + string.substring(2, 3) + "\\s*"));
    }
}