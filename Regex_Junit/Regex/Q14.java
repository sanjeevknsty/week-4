import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q14 {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}