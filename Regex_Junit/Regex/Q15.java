public class Q15 {
    public static void main(String[] args) {
        String regex = "\\d{3}\\-\\d{2}\\-\\d{4}";
        String str = "123-45-6811";
        System.out.println(str.matches(regex));
    }
}
