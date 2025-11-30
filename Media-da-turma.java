import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos terão suas notas informadas? ");
        int n = scanner.nextInt();

        double[] notas = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / n;

        int acima = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                acima++;
            }
        }

        System.out.println("\nMédia da turma: " + media);
        System.out.println("Alunos acima da média: " + acima);

        scanner.close();
    }
}