import java.util.regex.Pattern;

public class Q13 {
    public static void main(String[] args) {
        String regex = "\\$?\\d+\\.\\d{2}";
        String str = "12342.24";
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.matcher(str).matches());
    }
}
