import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);

        entrada.close();
    }
}
