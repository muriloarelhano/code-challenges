import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String linha = sc.nextLine();
            String[] numeros = linha.split(" ");
            if (numeros[0].equals("0") && numeros[1].equals("0")) {
                break;
            }
            String num1 = new StringBuilder(numeros[0]).reverse().toString();
            String num2 = new StringBuilder(numeros[1]).reverse().toString();
            int vaiUm = 0;
            int vaiUns = 0;
            for (int i = 0; i < Math.max(num1.length(), num2.length()); i++) {
                int dig1 = (i < num1.length()) ? num1.charAt(i) - '0' : 0;
                int dig2 = (i < num2.length()) ? num2.charAt(i) - '0' : 0;
                int soma = dig1 + dig2 + vaiUm;
                if (soma > 9) {
                    vaiUm = 1;
                    vaiUns++;
                } else {
                    vaiUm = 0;
                }
            }
            if (vaiUns == 0) {
                System.out.println("Nenhum vai-um");
            } else if (vaiUns == 1) {
                System.out.println("1 vai-um");
            } else {
                System.out.println(vaiUns + " vai-uns");
            }
        }

        sc.close();
    }
}