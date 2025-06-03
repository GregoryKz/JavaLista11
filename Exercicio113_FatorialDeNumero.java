package dev_klaus.lista11;
import java.util.Scanner;
public class Exercicio113_FatorialDeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int fatorial = 1, i = 1;
        do {
            fatorial *= i;
            i++;
        } while (i <= num);
        System.out.println("Fatorial de " + num + ": " + fatorial);
    }
}
