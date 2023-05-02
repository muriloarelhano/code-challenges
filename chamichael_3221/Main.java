import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            if (isCarmichael(n)) {
                System.out.println("O numero " + n + " eh um numero de Carmichael.");
            } else {
                System.out.println(n + " eh normal.");
            }
        }
        sc.close();
    }

    public static boolean isCarmichael(int n) {
        if (isPrime(n))
            return false;
        for (int a = 2; a < n; a++) {
            if (modPow(a, n, n) != a) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static int modPow(int a, int b, int m) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b /= 2;
        }
        return result;
    }

}