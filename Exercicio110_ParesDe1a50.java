package dev_klaus.lista11;

public class Exercicio110_ParesDe1a50 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }
}
