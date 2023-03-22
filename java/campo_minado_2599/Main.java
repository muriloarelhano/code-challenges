import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m == 0 && n == 0)
                break;

            char minefield[][] = new char[m][n];

            System.out.println(m + " " + n);

            populateMatrix(minefield, sc);
            printMatrix(minefield);

        }

    }

    public static char[][] populateMatrix(char[][] minefield, Scanner sc) {
        for (int line = 0; line < minefield.length - 1; line++) {
            char[] lineInput = sc.nextLine().toCharArray();
            System.out.println(lineInput );
            minefield[line] = lineInput;
        }
        return minefield;
    }

    public static void printMatrix(char[][] minefield) {

        for (int line = 0; line < minefield.length - 1; line++) {

            for (int column = 0; column < minefield[line].length - 1; column++) {
                System.out.println(minefield[line]);
            }

        }
    }
}
