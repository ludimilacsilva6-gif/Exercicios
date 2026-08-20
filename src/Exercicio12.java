import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o consumo de energia em kWh: ");
        double consumo = entrada.nextDouble();

        double valor;

        if (consumo <= 100) {
            valor = consumo * 0.50;
        } else if (consumo <= 300) {
            valor = consumo * 0.75;
        } else {
            valor = consumo * 1.10;
        }

        System.out.println("Valor da conta: R$ " + valor);

        entrada.close();
    }
}

