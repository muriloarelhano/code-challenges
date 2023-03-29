import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int n = sc.nextInt();

            if (n == 0)
                break;

            ArrayList<String> input = new ArrayList<String>();

            for (int i = 0; i <= n; i++) {
                input.add(sc.nextLine());
            }

            int m = sc.nextInt();

            ArrayList<String> answers = new ArrayList<String>();

            for (int i = 0; i <= m; i++) {
                answers.add(sc.nextLine());
            }
        }

    }

    public static void compareAnswers(ArrayList<String> inputs, ArrayList<String> answers) {

    }

}