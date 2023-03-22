import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            ArrayList<Integer> playerA = getLineCards(sc);
            ArrayList<Integer> playerB = getLineCards(sc);

            System.out.println(playerA);
            System.out.println(playerB);

            ArrayList<Integer> table = new ArrayList<Integer>();
            while (!playerA.isEmpty() || !playerB.isEmpty()) {
                // Player A Win
                if (playerA.get(0) > playerB.get(0)) {

                    // Player B Win
                } else if (playerA.get(0) > playerB.get(0)) {

                    // Equal
                } else {

                }
            }
        }

    }

    // Converter para integer
    public static ArrayList<Integer> getLineCards(Scanner sc) {
        ArrayList<String> inputs = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));

        ArrayList<Integer> cards = new ArrayList<Integer>();

        inputs.replaceAll(e -> e.replaceAll("[^0-9]", ""));

        for (String card : inputs) {
            cards.add(Integer.parseInt(card));
        }

        return cards;
    }
}
