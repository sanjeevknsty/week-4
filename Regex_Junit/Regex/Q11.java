import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q11 {
    public static void main(String[] args) {
        String regex = "^4|5\\d{15}$";
        String str = "4234123412341234";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
