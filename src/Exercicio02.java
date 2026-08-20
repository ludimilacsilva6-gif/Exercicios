
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Produto: " + (num1 * num2));
        System.out.println("Divisão inteira: " + (num1 / num2));
        System.out.println("Resto da divisão: " + (num1 % num2));

        entrada.close();
    }
}
