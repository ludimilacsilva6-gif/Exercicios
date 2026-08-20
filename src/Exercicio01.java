import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos e mede " + altura + " metros.");

        entrada.close();
    }
}
