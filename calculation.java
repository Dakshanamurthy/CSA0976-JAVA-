import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks in Python: ");
        double python = scanner.nextDouble();
        System.out.print("Enter the marks in C Programming: ");
        double c = scanner.nextDouble();
        System.out.print("Enter the marks in Mathematics: ");
        double math = scanner.nextDouble();
        System.out.print("Enter the marks in Physics: ");
        double physics = scanner.nextDouble();

        double total = python + c + math + physics;
        double aggregate = total / 4.0;
        
        System.out.println("Total marks = " + total);
        System.out.println("Aggregate marks = " + aggregate);
        
        if (aggregate >= 75.0) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60.0 && aggregate < 75.0) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50.0 && aggregate < 60.0) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40.0 && aggregate < 50.0) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
    }
}