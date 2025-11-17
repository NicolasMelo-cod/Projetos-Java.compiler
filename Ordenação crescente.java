import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] num = new int[10];

        
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        
        Arrays.sort(num);

        
        System.out.println("\nNúmeros ordenados em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }

        sc.close();
    }
}