import java.util.Arrays;

public class SimpleProcessor {

    public void processNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

    public void printPositiveNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}