// Fazer um programa que o usuário entre com o seu nome completo e o programa exiba na tela apenas o primeiro e último nome. 
// Exemplo: para a entrada de nome "Ana Maria de Souza", o programa deverá imprimir na tela "Ana Souza".

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Insira seu nome:");
        try (Scanner myObj = new Scanner(System.in)) {
			String name = myObj.nextLine();
			String surname[] = name.split(" ");
			System.out.print(surname[0]+" ");
			System.out.print(surname[surname.length-1]);
		}
}
}