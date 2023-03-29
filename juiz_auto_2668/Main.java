import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int runNum = 0;
        while (sc.hasNextLine()) {

            runNum++;

            int n = sc.nextInt();

            if (n == 0)
                break;

            System.out.println("Run #" + runNum + ": ");

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
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i).equals(answers.get(i))) {
                System.out.println("Accepted");
            } else {
                String str = "qwerty1qwerty2";
                str = str.replaceAll("[^0-9]+", " ");
            }
        }
    }

}