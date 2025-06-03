package dev_klaus.lista11;

public class Exercicio118_ContarNumerosPrimosDe1a100 {
    public static void main(String[] args) {
        int i = 2, contPrimos = 0;
        do {
            int div = 0, j = 1;
            do {
                if (i % j == 0) div++;
                j++;
            } while (j <= i);
            if (div == 2) {
                System.out.println(i);
                contPrimos++;
            }
            i++;
        } while (i <= 100);
        System.out.println("Total de primos: " + contPrimos);
    }
}
