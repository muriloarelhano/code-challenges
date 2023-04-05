import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int runNum = 0;
        int numPlayers;

        while ((numPlayers = sc.nextInt()) != 0) {
            sc.nextLine();
            runNum++;

            System.out.println("Teste " + runNum);

            ArrayList<Player> players = new ArrayList<Player>();

            for (int i = 0; i < numPlayers; i++) {
                String name = sc.nextLine();
                ArrayList<Integer> points = new ArrayList<Integer>();

                for (String point : new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")))) {
                    points.add(Integer.parseInt(point));
                }

                Player player = new Player(name, points);
                player.sumPoints();

                players.add(player);

                // System.out.println(player.name + " " + player.getResult());//

            }

            // Ordenação em ordem alfabetica
            players.sort((a, b) -> a.name.compareTo(b.name));
            players.sort((a, b) ->   b.getResult() - a.getResult());

            for (int i = 0; i < players.size(); i++) {

                int ranking = i + 1;

                if (players.get(i).getRank() == 0) {
                    players.get(i).setRank(ranking);
                }

                if (i > 0) {
                    if (players.get(i - 1).getResult() == players.get(i).getResult()) {
                        players.get(i).setRank(players.get(i - 1).getRank());
                    }
                }

            }

            for (Player player : players) {
                System.out.println(player.getRank() + " " + player.getResult() + " " + player.name.split(" ")[0]);
            }
            // Precisa pular a linha
            System.out.println("");
        }

    }

}

class Player {
    public String name;
    public ArrayList<Integer> points;
    private int result = 0;
    private int rank = 0;

    public Player(String name, ArrayList<Integer> points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", result=" + this.result + "rank=" + this.rank + "]";
    }

    public void sumPoints() {
        Collections.sort(this.points);
        for (int i = 1; i < this.points.size() - 1; i++) {
            this.result += this.points.get(i);
        }
    }

    public int getResult() {
        return this.result;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}