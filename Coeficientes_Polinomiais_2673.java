import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            int coefficient = calculateCoefficient(n, n1, n2);
            System.out.println(coefficient);
        }
    }

    private static int calculateCoefficient(int n, int n1, int n2) {
        int coefficient = factorial(n) / (factorial(n1) * factorial(n2));
        return coefficient;
    }

    private static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
