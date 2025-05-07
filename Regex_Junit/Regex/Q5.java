import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q5 {
    public static void main(String[] args) {
        String regex = "[A-Z][a-z]+";
        String str = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("found " + matcher.group());
        }
    }
}
