import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void summ() {
        Calculator cal = new Calculator();


        int expected = 8;
        int real = cal.Summ(4,4);

        System.out.println("Expect " + expected);
        System.out.println("Real " + real);

        assertEquals(expected,real);
    }


}