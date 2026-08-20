import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double reais = entrada.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = entrada.nextDouble();

        double dolares = reais / cotacao;

        System.out.println("O valor convertido é: US$ " + dolares);

        entrada.close();
    }
}