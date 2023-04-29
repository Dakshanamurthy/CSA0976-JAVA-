import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, positiveCount = 0, negativeCount = 0;
        double positiveSum = 0, negativeSum = 0;

        while (true) {
            System.out.print("Enter the number: ");
            num = input.nextInt();

            if (num == -1) {
                break;
            }

            if (num >= 0) {
                positiveCount++;
                positiveSum += num;
            } else {
                negativeCount++;
                negativeSum += num;
            }
        }

        if (positiveCount > 0) {
            double positiveAvg = positiveSum / positiveCount;
            System.out.println("The average of positive numbers is: " + positiveAvg);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        if (negativeCount > 0) {
            double negativeAvg = negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + negativeAvg);
        } else {
            System.out.println("No negative numbers were entered.");
        }
    }
}