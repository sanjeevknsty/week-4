import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("damn", "stupid");
        String text = "This is a damn bad example with some stupid words.";
        for (String i : arr) {
            text = text.replaceAll("(?i)\\b" + i + "\\b", "****");
        }
        System.out.println(text);
    }
}
