import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a altura do aluno " + i + " (m): ");
            altura = sc.nextDouble();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        System.out.println("\nAluno mais alto: " + maiorAltura + " m");
        System.out.println("Aluno mais baixo: " + menorAltura + " m");

        sc.close();
    }
}

