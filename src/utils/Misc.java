package utils;

public class Misc {
    public static int[] evenOddCounter(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number == 0) {
                continue;
            } else if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[] { evenCount, oddCount };
    }

}
