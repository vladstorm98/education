package input_output;

public class Calc {

    public long makeOperation( long num1, long num2, String operationType) {
        if (operationType.equals("+")) {
            return sum(num1, num2);
        }
        throw new UnsupportedOperationException("Operation doesn't work");
    }

    private long sum(long num1, long num2) {
        return num1 + num2;
    }
}
