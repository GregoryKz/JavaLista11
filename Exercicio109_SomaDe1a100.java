package dev_klaus.lista11;
import java.util.Scanner;
public class Exercicio109_SomaDe1a100 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        do {
            soma += i;
            i++;
        } while (i <= 100);
        System.out.println("Soma de 1 a 100: " + soma);
    }
}
