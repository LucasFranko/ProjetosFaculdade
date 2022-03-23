// Fazer um programa para calcular o Índice de Massa Corporal. 
// O programa deverá exibir a janela de diálogo duas vezes, na primeira vez o usuário deverá fornecer o peso e na segunda a altura. 
// Em seguida, o programa deverá imprimir na tela o valor do IMC. A fórmula de cálculo do IMC é peso/(altura*altura).

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        float sum;
        try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Insira seu peso:");
			float weight = myObj.nextFloat();
			System.out.println("Insira sua altura:");
			float height = myObj.nextFloat();
			sum=weight/(height*height);
		}
        System.out.println(sum);
}
}