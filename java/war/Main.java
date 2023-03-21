import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            ArrayList<String> playerA = getLineCards(sc);
            ArrayList<String> playerB = getLineCards(sc);

            System.out.println(playerA);
            System.out.println(playerB);

            while (!playerA.isEmpty() || !playerB.isEmpty()) {
                
            }
        }

    }

    public static ArrayList<String> getLineCards(Scanner sc) {
        ArrayList<String> inputs = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));

        inputs.replaceAll(e -> e.replaceAll("[^0-9]", ""));

        return inputs;
    }
}

