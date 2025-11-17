import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int quantidadeImpares = 0;

        System.out.println("Digite os valores da matriz 3x4:");

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

       
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nNúmeros ímpares encontrados:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                    quantidadeImpares++;
                }
            }
        }

        System.out.println("\n\nQuantidade de números ímpares: " + quantidadeImpares);

        scanner.close();
    }
}
