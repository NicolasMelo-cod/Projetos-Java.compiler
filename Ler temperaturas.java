import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double[] temp = new double[30];

       
        System.out.println("Digite a temperatura média dos 30 dias:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temp[i] = sc.nextDouble();
        }

        
        double menor = temp[0];
        double maior = temp[0];
        double soma = 0;

        for (int i = 0; i < 30; i++) {
            soma += temp[i];

            if (temp[i] < menor) {
                menor = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            }
        }

        double media = soma / 30;

        
        int diasAbaixo = 0;
        for (int i = 0; i < 30; i++) {
            if (temp[i] < media) {
                diasAbaixo++;
            }
        }

        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + media);
        System.out.println("Dias abaixo da média: " + diasAbaixo);

        sc.close();
    }
}