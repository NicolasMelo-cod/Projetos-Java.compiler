import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[5][4];
        int aprovados = 0;
        int reprovados = 0;

        System.out.println("Digite as notas da matriz 5x4:");

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota do aluno " + (i + 1) + ", disciplina " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (notas[i][j] >= 7) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }
        }

        
        System.out.println("\nTotal de notas aprovadas (>= 7): " + aprovados);
        System.out.println("Total de notas reprovadas (< 7): " + reprovados);

        scanner.close();
    }
}