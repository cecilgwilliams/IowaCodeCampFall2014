import com.sun.javaws.exceptions.InvalidArgumentException;

import javax.inject.Inject;

public class Calculator {

    @Inject
    private StringCalculator stringCalculator;

    public int add(String s) throws InvalidArgumentException {
        return stringCalculator.add(s);
    }
}
