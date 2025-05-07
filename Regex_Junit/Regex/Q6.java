import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6 {
    public static void main(String[] args) {
        String regex = "[0-9]{2}+\\/[0-9]{2}+\\/[0-9]{4}+";
        String str = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("found " + matcher.group());
        }
    }
}
