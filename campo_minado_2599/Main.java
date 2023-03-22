import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            sc.nextLine();

            if (rows == 0 && columns == 0)
                break;

            MineField minefield = new MineField(rows, columns, sc);

            minefield.print();

        }

    }

}

class MineField {
    private int rowCount;
    private int collCount;
    private char[][] minefield;
    private Scanner sc;

    public MineField(int rowCount, int collCount, Scanner sc) {
        this.rowCount = rowCount;
        this.collCount = collCount;
        this.sc = sc;

        this.minefield = new char[rowCount][collCount];

        this.populateMine();
        this.verifyCells();
    }

    private void populateMine() {
        for (int line = 0; line < minefield.length; line++) {
            char[] lineInput = this.sc.nextLine().toCharArray();
            this.minefield[line] = lineInput;
        }
    }

    private void verifyCells() {
        for (int line = 0; line < minefield.length; line++) {
            for (int col = 0; col < minefield[line].length; col++) {
                if (!validateMine(line, col))
                    this.minefield[line][col] = this.countMinesInAdjacencies(line, col);
            }
        }
    }

    public void print() {
        System.out.println("Printing result...");
        for (int line = 0; line < minefield.length; line++) {
            System.out.println(minefield[line]);
        }
    }

    private char countMinesInAdjacencies(int row, int col) {
        int minesInAdjacencies = 0;

        if (validateCell(row - 1, col)) // encima
            minesInAdjacencies++;
        if (validateCell(row, col - 1)) // esquerda
            minesInAdjacencies++;
        if (validateCell(row + 1, col)) // embaixo
            minesInAdjacencies++;
        if (validateCell(row, col + 1))// direita
            minesInAdjacencies++;
        if (validateCell(row - 1, col + 1)) // canto direito inferior
            minesInAdjacencies++;
        if (validateCell(row - 1, col - 1)) // canto esquerdo inferior
            minesInAdjacencies++;
        if (validateCell(row + 1, col + 1)) // canto direito superior
            minesInAdjacencies++;
        if (validateCell(row + 1, col - 1)) // canto esquerdo superior
            minesInAdjacencies++;

        return (char) (Character.forDigit(minesInAdjacencies, 10));
    }

    public boolean validateCell(int row, int col) {
        if ((row < this.rowCount && row > 0) && (col < this.collCount && col > 0)) {

            return validateMine(row, col);

        } else {
            return false;
        }

    }

    private boolean validateMine(int row, int col) {

        if (this.minefield[row][col] == '*') {
            return true;
        } else {
            return false;
        }
    }

}