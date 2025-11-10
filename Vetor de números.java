import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];

        // Leitura dos números
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibindo apenas os pares
        System.out.println("\nNúmeros pares digitados:");
        for (int i = 0; i < 15; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        scanner.close();
    }
}