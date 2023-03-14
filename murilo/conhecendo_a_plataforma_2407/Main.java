import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int i = sc.nextInt();
            if (i <= 0 && i >= 1000000)
                break;

            int j = sc.nextInt();
            if (i <= 0 && j >= 1000000)
                break;

            int interval[] = IntStream.rangeClosed(i, j).toArray();

            int biggerSequenceSize = 0;

            for (int num : interval) {
                int size = getSequenceSize(num);
                if (biggerSequenceSize < size) {
                    biggerSequenceSize = size;
                }
            }

            System.out.println(String.format("%d %d %d", i, j, biggerSequenceSize));

        }

    }

    public static int getSequenceSize(int number) {
        int aux = number;
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        while (aux != 1) {
            if (aux % 2 == 0) {
                aux = aux / 2;
            } else {
                aux = (aux * 3) + 1;
            }
            sequence.add(aux);
        }
        // System.out.println(sequence.toString() + " " + sequence.size());
        return sequence.size() + 1;
    }

}