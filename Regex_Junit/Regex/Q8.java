import java.util.regex.Pattern;

public class Q8 {
    public static void main(String[] args) {
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        String str = "This   is an    example   with   multiple spaces.";
        System.out.println(pattern.matcher(str).replaceAll(" "));
    }
}
