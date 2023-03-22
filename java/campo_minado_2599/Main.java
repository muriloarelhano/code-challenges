import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();

            if (m == 0 && n == 0)
                break;

            char minefield[][] = new char[m][n];

            System.out.println(m + " " + n);

            populateMatrix(minefield, sc);
            printMatrix(minefield);

        }

    }

    public static char[][] populateMatrix(char[][] minefield, Scanner sc) {
        for (int line = 0; line < minefield.length; line++) {
            char[] lineInput = sc.nextLine().toCharArray();
            minefield[line] = lineInput;
        }
        return minefield;
    }

    public static void printMatrix(char[][] minefield) {

        for (int line = 0; line < minefield.length; line++) {
            System.out.println(minefield[line]);
        }
    }
}
