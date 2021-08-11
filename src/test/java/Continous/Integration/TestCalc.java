package Continous.Integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestCalc 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void testCalc()
    {
        Calc calc = new Calc();
        assertEquals(calc.add(2,2), 4);
    }
}