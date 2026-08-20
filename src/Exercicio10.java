import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = entrada.nextDouble();

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        entrada.close();
    }
}
