public class Q12 {
    public static void main(String[] args) {
        String arr[] = {"JavaScript","Python","Java","Go"};
        String str= "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        for(String s: arr){
            String regex =  s;
            if(str.matches(".*" + regex + ".*")){
                System.out.println("found " + s);
            }
        }
    }
}
