package dev_klaus.lista11;
import java.util.Scanner;

public class Exercicio117_MediaDe10Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, i = 1;
        do {
            System.out.print("Digite o " + i + "º número: ");
            soma += scanner.nextInt();
            i++;
        } while (i <= 10);
        System.out.println("Média: " + (soma / 10.0));
    }
}
