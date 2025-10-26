import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        double altura, peso;

        
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE;
        double menorPeso = Double.MAX_VALUE;

        
        double somaAltura = 0;
        double somaPeso = 0;
        int totalClientes = 0;

        
        while (true) {
            System.out.print("Digite o código do cliente (0 para sair): ");
            codigo = sc.nextInt();
            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a altura do cliente (m): ");
            altura = sc.nextDouble();

            System.out.print("Digite o peso do cliente (kg): ");
            peso = sc.nextDouble();

            // Atualiza extremos
            if (altura > maiorAltura) maiorAltura = altura;
            if (altura < menorAltura) menorAltura = altura;
            if (peso > maiorPeso) maiorPeso = peso;
            if (peso < menorPeso) menorPeso = peso;

            // Atualiza somas e contagem
            somaAltura += altura;
            somaPeso += peso;
            totalClientes++;
        }

        if (totalClientes > 0) {
            System.out.println("\n--- Relatório da Academia ---");
            System.out.println("Mais alto: " + maiorAltura + " m");
            System.out.println("Mais baixo: " + menorAltura + " m");
            System.out.println("Mais gordo: " + maiorPeso + " kg");
            System.out.println("Mais magro: " + menorPeso + " kg");
            System.out.printf("Altura média: %.2f m%n", somaAltura / totalClientes);
            System.out.printf("Peso médio: %.2f kg%n", somaPeso / totalClientes);
        } else {
            System.out.println("Nenhum cliente registrado.");
        }

        sc.close();
    }
}
