import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private StringCalculator stringCalculator;

    @InjectMocks
    private Calculator calculator;

    @Test
    public void testAdd() throws InvalidArgumentException {
        String s = "1,2";
        when(stringCalculator.add(s)).thenReturn(17);
        when(stringCalculator.add("1,2")).thenReturn(24);
        int result = calculator.add(s);
        verify(stringCalculator).add(s);
        assertEquals(24, result);
    }
}
