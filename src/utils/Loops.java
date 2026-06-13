package utils;

public class Loops {
    public static void highlightMultiplesOfFive(int limit) {
        int i = 0;
        int counter = 0;

        while (i <= limit && i > 0) {
            if (i % 5 == 0) {
                System.out.print(i + "*");
                counter++;
            } else {
                System.out.print(i);
            }

            if (i < limit) {
                System.out.print(", ");
            }
            i++;
        }

        System.out.println("\nTotal multiples of 5: " + counter);
    }

    public static void randomNumberGuessing() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess;
        int distance;

        do {
            guess = new Input().genericPositiveIntInput("Guess the number (1-100): ", 100);
            attempts++;

            if (guess == randomNumber) {
                String rating = switch (attempts) {
                    case 1 -> "First try! You're a genius!";
                    case 2, 3, 4 -> "Great job!";
                    case 5, 6, 7 -> "Not bad!";
                    default -> "Keep working on it pal.";
                };
                System.out.println("Congratulations! You've guessed the number in %d attempts. %s".formatted(attempts, rating));
                break;
            }

            // direction hints
            if (guess < randomNumber) {
                System.out.print("Too low! ");
            } else if (guess > randomNumber) {
                System.out.print("Too high! ");
            }

            // distance hints
            distance = Math.abs(guess-randomNumber);

            if (distance <= 10) {
                System.out.println("You're burning!");
            } else if (distance <= 40) {
                System.out.println("You're warming up!");
            } else if (distance <= 70) {
                System.out.println("You can barely feel the warmth!");
            } else {
                System.out.println("You're hypothermic.");
            }

        }
        while (guess != randomNumber);
    }
}
