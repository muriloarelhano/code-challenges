import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int lastYear = sc.nextInt();

            if (!(lastYear > 2000 || lastYear < 3000)){}
          

            int b = sc.nextInt();
            int c = sc.nextInt();

            int AB_Threshold = 100000;

            if (!(b < AB_Threshold && c < AB_Threshold)){}
               

            System.out.println(lastYear + mmc(b, c));
        }
    }

    private static int mdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int mmc(int a, int b) {
        return a * (b / mdc(a, b));
    }

}