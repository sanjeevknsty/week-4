import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2 {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern =Pattern.compile(regex);
        String num = "BU0359";
        Matcher match = pattern.matcher(num);
        System.out.println(match.matches());

    }
}
