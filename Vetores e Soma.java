import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        
        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];

        
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < N; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = sc.nextInt();
        }

        
        for (int i = 0; i < N; i++) {
            Soma[i] = A[i] + B[i];
        }

        
        int somaTotal = 0;
        for (int i = 0; i < N; i++) {
            somaTotal += Soma[i];
        }

        System.out.println("A somatória final é: " + somaTotal);

        sc.close();
    }
}