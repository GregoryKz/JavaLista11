package dev_klaus.lista11;

public class Exercicio111_ProdutoDe1a10 {
    public static void main(String[] args) {
        int produto = 1;
        int i = 1;
        do {
            produto *= i;
            i++;
        } while (i <= 10);
        System.out.println("Produto de 1 a 10: " + produto);
    }
}
