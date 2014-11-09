import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() throws Exception {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testEmptyString() throws InvalidArgumentException {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test(expected = InvalidArgumentException.class)
    public void testNullString() throws InvalidArgumentException {
        stringCalculator.add(null);
    }

    @Test
    public void testOneNumber() throws InvalidArgumentException {
        assertEquals(7, stringCalculator.add("7"));
    }

    @Test
    public void testTwoNumbers() throws InvalidArgumentException {
        assertEquals(7, stringCalculator.add("3,4"));
    }

    @Test
    public void testMultiNumbers() throws InvalidArgumentException {
        assertEquals(27, stringCalculator.add("3,4,5,8,7"));
    }
}
