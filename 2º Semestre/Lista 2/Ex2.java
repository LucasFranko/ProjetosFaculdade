// Fazer um programa para que o usuário entre com um número inteiro. Após isso, o programa deve calcular o termo correspondente da sequência de Fibonacci. Primeiros números da sequência: 0, 1, 1, 2, 3, 5 ...
// Para se calcular o próximo termo da sequência de Fibonacci, é necessário somar os dois termos anteriores.

import java.util.Scanner;

public class Ex2 {
    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String args []) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int num = obj.nextInt();
            System.out.println("A sequência é: ");
            for (int i = 0; i < num; i++) {
                System.out.print(Ex2.fibonacci(i) + "\t");
            }
        }

    }
}