import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int menor = Integer.MAX_VALUE;
        int posicaoMenor = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor para a posição " + i + ": ");
            int valor = scanner.nextInt();

            vetor[i] = valor;

            if (valor < menor) {
                menor = valor;
                posicaoMenor = i;
            }
        }

        System.out.println("\nValores do vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nMenor valor encontrado: " + menor);
        System.out.println("Posição do menor valor: " + posicaoMenor);

        scanner.close();
    }
}