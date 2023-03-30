import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int runNum = 0;
        while (sc.hasNextLine()) {

            runNum++;

            int n = sc.nextInt();
            sc.nextLine();

            if (n == 0)
                break;

            System.out.print("Run #" + runNum + ": ");

            ArrayList<String> inputs = new ArrayList<String>();

            for (int i = 0; i < n; i++) {
                inputs.add(sc.nextLine());
            }

            int m = sc.nextInt();
            sc.nextLine();

            ArrayList<String> answers = new ArrayList<String>();

            for (int i = 0; i < m; i++) {
                answers.add(sc.nextLine());
            }

        
            compareAnswers(inputs, answers);

        }

    }

    public static void compareAnswers(ArrayList<String> inputs, ArrayList<String> answers) {
        String result = "";
        for (int i = 0; i < inputs.size(); i++) {
            // Caso a resposta seja exatamente igual
            if (inputs.get(i).equals(answers.get(i))) {
                result = "Accepted";
                continue;
            }

            // Caso não seja exatamente igual
            String inputStr = inputs.get(i).replaceAll("[^0-9]+", "");
            String answerStr = answers.get(i).replaceAll("[^0-9]+", "");

            if (inputStr.length() > 0 && answerStr.length() > 0) {
                int inputNums = Integer.parseInt(inputStr);
                int answerNums = Integer.parseInt(answerStr);

                if (inputs.get(i).equals(answers.get(i)) == false && inputNums == answerNums) {
                    result = "Presentation Error";
                    continue;
                }
            } else {
                result = "Presentation Error";
                continue;
            }

            result = "Wrong Answer";
        }

        System.out.println(result);
    }

}