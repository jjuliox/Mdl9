import java.util.Scanner;

public class TarefaMedia {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / 4;
        System.out.printf("A média das notas é: %.2f\n", media); // Exibindo a média com 2 casas decimais

        scanner.close();
    }
}