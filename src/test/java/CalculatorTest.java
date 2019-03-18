import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
      int calculation = calculator.add(2, 2);
      assertEquals(4, calculation);
    }

    @Test
    public void canSubtract(){
        int calculation = calculator.subtract(4, 2);
        assertEquals(2, calculation);
    }

    @Test
    public void canMultiply(){
        int calculation = calculator.multiply(5, 5);
        assertEquals(25, calculation);
    }

    @Test
    public void canDivide(){
        int calculation = calculator.divide(20, 2);
        assertEquals(10, calculation);
    }

}
