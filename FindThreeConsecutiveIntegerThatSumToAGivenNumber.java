import java.util.Arrays;

public class FindThreeConsecutiveIntegerThatSumToAGivenNumber {
    public static void main(String[] args) {
        long num = 333;
        System.out.println(Arrays.toString(sumOfThree(num)));
    }

    public static long[] sumOfThree(long num) {
        if (num % 3 == 0) {
            return new long[] { (num / 3) - 1, num / 3, (num / 3) + 1 };
        }
        return new long[] {};
    }
}
