package dev_klaus.lista11;

public class Exercicio115_DivisiveisPor3De1a50 {
    public static void main(String[] args) {
        int i = 1, cont = 0;
        do {
            if (i % 3 == 0) {
                cont++;
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
        System.out.println("Quantidade de divisíveis por 3: " + cont);
    }
}
