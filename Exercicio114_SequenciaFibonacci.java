package dev_klaus.lista11;

public class Exercicio114_SequenciaFibonacci {
    public  static void main(String[] args) {
        int a = 0, b = 1, i = 1;
        do {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        } while (i <= 10);
    }
}
