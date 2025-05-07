import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);

        String str = "Contact us at support@example.com and info@company.org";
        Matcher match = pattern.matcher(str);
        while(match.find()){
            System.out.println("found " + match.group());
        }

    }
}
