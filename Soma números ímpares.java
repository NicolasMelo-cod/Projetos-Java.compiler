import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaImpares = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();

            if (num % 2 != 0) { // verifica se é ímpar
                somaImpares += num;
            }
        }

        System.out.println("A soma dos números ímpares é: " + somaImpares);

        scanner.close();
    }
}