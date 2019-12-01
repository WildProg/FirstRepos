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


    @Test
    void greeting() {
        Calculator cal = new Calculator();


        String expected = "Hi Oleg";
        String real = cal.Greeting(" Oleg");

        System.out.println("Expect " + expected);
        System.out.println("Real " + real);
        System.out.println("Action has been started...");

        assertEquals(expected,real);
    }
}