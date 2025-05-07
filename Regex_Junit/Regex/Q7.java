import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q7 {
    public static void main(String[] args) {
        String regex = "https?://(www\\.)?[a-zA-Z0-9]+.[a-zA-Z]{0,4}";
        String str = "Visit https://www.google.com and http://example.org for more info.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println("Found " + matcher.group());
        }
    }
}
