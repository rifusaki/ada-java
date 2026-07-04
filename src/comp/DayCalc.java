package comp;

public class DayCalc {
    public static int dayCalculator(int[] input) {
        if (input == null || input.length != 3) {
            throw new IllegalArgumentException("Input must contain [years, months, days]");
        }

        if (input[0] < 0 || input[1] < 0 || input[2] < 0) {
            throw new IllegalArgumentException("Date values cannot be negative");
        }

        return input[0] * 365 + input[1] * 30 + input[2];
    }

    public static void main(String[] args) {
    int[][] dates = {{5, 4, 14}, {10, 8, 16}};
    int index = 1;
    for (int[] dateInput : dates) {
      System.out.println("Input: [%d, %d, %d], Total days for date %d: %d".formatted(dateInput[0], dateInput[1], dateInput[2], index, DayCalc.dayCalculator(dateInput)));
      index++;
    }
    }

}

