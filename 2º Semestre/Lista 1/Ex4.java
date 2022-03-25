// Fazer um programa que exiba a janela de diálogo três vezes, em cada uma delas o usuário irá entrar com um número inteiro. Após isso o programa deverá imprimir na tela o somatório dos valores.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Insira um número:");
			int n1 = myObj.nextInt();
			System.out.println("Insira outro número:");
			int n2 = myObj.nextInt();
			System.out.println("Insira mais um número:");
			int n3 = myObj.nextInt();
			System.out.println("O somatório dos números é: " + (n1 + n2 + n3));
		}
}
}
