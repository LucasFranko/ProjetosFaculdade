// Fazer um programa que o usuário entre com uma frase e o programa imprima na tela a frase com todos os caracteres em maiúsculo.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Insira uma frase:");
			String phrase = myObj.nextLine();
			System.out.println(phrase.toUpperCase());
		}
}
}