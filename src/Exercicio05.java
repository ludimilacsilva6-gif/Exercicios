import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = entrada.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - inss;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto do INSS: R$ " + inss);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        entrada.close();
    }
}
