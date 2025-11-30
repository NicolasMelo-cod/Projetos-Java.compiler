import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];

        System.out.println("Digite 3 nomes para começar:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nDigite um nome para buscar: ");
        String busca = scanner.nextLine();

        boolean achei = false;

        for (int i = 0; i < 3; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                achei = true;
                break;
            }
        }

        if (achei) {
            System.out.println("\nNome encontrado");
        } else {
            System.out.println("\nNome não encontrado");
        }

        scanner.close();
    }
}