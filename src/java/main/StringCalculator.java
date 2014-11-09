import com.sun.javaws.exceptions.InvalidArgumentException;

public class StringCalculator {
    public int add(String s) throws InvalidArgumentException {
        if (s == null) {
            throw new InvalidArgumentException(new String[]{"Null argument!!"});
        }

        String[] numbers = s.split(",");

        int sum = 0;
        if (numbers.length > 0) {
            for (String number : numbers) {
                if (number.length() == 0) {
                    return 0;
                }
                sum += Integer.parseInt(number);
            }
            return sum;
        }

        return 0;
    }
}
