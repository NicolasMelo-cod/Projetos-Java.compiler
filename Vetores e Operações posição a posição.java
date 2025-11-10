public class Main {
    public static void main(String[] args) {

        
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {5, 4, 3, 2, 1};
        int[] C = new int[5]; 

        
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] * B[i];
        }

        
        System.out.print("Vetor A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.print("\nVetor B: ");
        for (int num : B) {
            System.out.print(num + " ");
        }

        System.out.print("\nVetor C (A * B): ");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}
