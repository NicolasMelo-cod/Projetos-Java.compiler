public class Main {
    public static void main(String[] args) {

        // Vetor inicial
        int[] vetor = {4, 7, 2, 9, 1, 3, 8, 6};

        System.out.println("Vetor inicial:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Algoritmo de trocas (invertendo o vetor)
        for (int i = 0; i < 4; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[7 - i];
            vetor[7 - i] = aux;
        }

        // Vetor final
        System.out.println("Vetor após as trocas:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}