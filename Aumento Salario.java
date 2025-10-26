import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário inicial: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite o percentual de aumento anual (%): ");
        double percentual = sc.nextDouble();

        System.out.print("Digite o número de anos: ");
        int anos = sc.nextInt();

        System.out.println("\n--- Salário por ano ---");

        for (int i = 1; i <= anos; i++) {
            salario = salario + (salario * percentual / 100); // aumenta o salário
            System.out.printf("Ano %d: R$ %.2f%n", i, salario);
        }

        System.out.printf("\nSalário após %d anos: R$ %.2f%n", anos, salario);

        sc.close();
    }
}
