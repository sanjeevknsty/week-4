import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q10 {
    public static void main(String[] args) {
        String regex = "^([1-9]?[0-9]|1[0-9][0-9]|2[0-5][0-5])\\.+([1-9]?[0-9]|1[0-9][0-9]|2[0-5][0-5])\\.+([1-9]?[0-9]|1[0-9][0-9]|2[0-5][0-5])$";
        String str = "245.245.245";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
