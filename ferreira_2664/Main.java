import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de casos de teste
        int numOfLines = sc.nextInt();

        // Processa cada caso de teste
        for (int lineCounter = 1; lineCounter <= numOfLines; lineCounter++) {
            // Lê o número
            int n = sc.nextInt();

            // Incrementa n até encontrar um número de Ferreira maior do que ele
            while (true) {
                n++;

                // Ignora os números primos
                if (isPrime(n))
                    continue;

                int digitsN = sumDigits(n);
                int digitsF = Arrays.stream(calcPrimeFactors(n)).sum();
                if (digitsN == digitsF) {
                    System.out.println(n);
                    break;
                }

            }
        }
    }

    public static int sumDigits(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static int[] calcPrimeFactors(int n) {
        int[] factors = new int[100];
        int idx = 0;
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {

                factors[idx++] = i >= 10 ? sumDigits(i) : i;
                n /= i;
            }
        }
        if (n > 1) {
            factors[idx++] = n >= 10 ? sumDigits(n) : n;
        }
        int[] result = new int[idx];
        System.arraycopy(factors, 0, result, 0, idx);
        return result;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}