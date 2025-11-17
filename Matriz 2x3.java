import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        
        System.out.println("Digite os valores da matriz 2x3:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        
        int somaDiagonal = matriz[0][0] + matriz[1][1];

        System.out.println("\nSoma da diagonal: " + somaDiagonal);

        scanner.close();
    }
}