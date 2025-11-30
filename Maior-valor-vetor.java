import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int maior = -1; 
        int posicaoMaior = -1;

        for (int i = 0; i < 10; i++) {
            int valor;

            do {
                System.out.print("Digite um valor POSITIVO para a posição " + i + ": ");
                valor = scanner.nextInt();

                if (valor < 0) {
                    System.out.println("Valor inválido! Só são aceitos números positivos.");
                }

            } while (valor < 0);

            vetor[i] = valor;

            if (valor > maior) {
                maior = valor;
                posicaoMaior = i;
            }
        }

        System.out.println("\nValores do vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nMaior valor encontrado: " + maior);
        System.out.println("Posição do maior valor: " + posicaoMaior);

        scanner.close();
    }
}