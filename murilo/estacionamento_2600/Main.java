import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> estacionamento = new ArrayList<Integer>();
        while (sc.hasNext()) {
            int acao = sc.nextInt();
            int placa = sc.nextInt();

            if (acao == 1) {
                if(estacionamento.size() == 10) {
                    System.out.println("Nao ha vaga no estacionamento"); 
                    continue;
                }
                estacionamento.add(placa);
                System.out.println("Carro estacionado");
                

            }

            if (acao == 2) {
                int posicaoCarro = estacionamento.indexOf(placa);
                if (posicaoCarro < 0) {
                    System.out.println("Carro nao encontrado");
                } else {
                     
                     
                        System.out.println(String.format("Carro liberado apos %d movimentos", posicaoCarro));
                        estacionamento.remove(posicaoCarro);
                     
                }
            }

        }

    }
}