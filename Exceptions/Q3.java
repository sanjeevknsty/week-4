
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Q3 {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Invalid age");
        }
    }
    public static void main(String[] args) {
        try{
            validateAge(12);
            System.out.println("Valid age");
        }catch (InvalidAgeException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
