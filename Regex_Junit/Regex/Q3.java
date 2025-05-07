import java.util.regex.Pattern;

public class Q3 {
    public static void main(String[] args) {
        String regex = "^#[a-zA-Z0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        String str = "#FFA233";
        System.out.println(pattern.matcher(str).matches());
    }
}
