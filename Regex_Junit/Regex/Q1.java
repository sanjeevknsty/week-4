import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
        Pattern pattern = Pattern.compile(regex);

        String input = "U_12";
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());


    }
}
