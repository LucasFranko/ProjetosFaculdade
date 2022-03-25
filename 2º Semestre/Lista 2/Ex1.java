// Fazer um programa para calcular o fatorial de um número. Para se calcular o fatorial de um número, é necessário multiplicar ele por todos os seus antecessores até chegar número 1.
// Exemplo: para calcular o fatorial de 5 é necessário multiplicar 5 x 4 x 3 x 2 x 1.

import java.util.Scanner;

public class Ex1 {
    public static void main(String args []){
        try (Scanner numero = new Scanner(System.in)) {
            int num, fat = 1;
            int cont = 1;

            do{
                System.out.println("Digite um número: ");
                num = numero.nextInt();
                for(int i = 1; i <= num; i++){
                    fat = fat * i;
                }
                System.out.println("O fatorial de " + num + " é " + fat);
                cont++;
            }
            while(cont < 2);
        }
    }
}