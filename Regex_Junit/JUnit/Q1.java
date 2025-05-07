import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}
class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }
}

public class Q1 {
    public static void main(String[] args) {

    }
}
