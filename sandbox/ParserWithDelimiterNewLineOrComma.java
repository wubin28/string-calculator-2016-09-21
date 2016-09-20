import java.util.List;
import java.util.Arrays;

public class ParserWithDelimiterNewLineOrComma implements StringCalculatorParser {
    @Override
    public List<String> parse(String string) {
        return Arrays.asList(string.split("\\s*[,|\\n]\\s*"));        
    }
}