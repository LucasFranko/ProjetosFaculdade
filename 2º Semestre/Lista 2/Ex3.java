// Muitos não sabem, mas o Real não foi a única moeda que circulou pelo Brasil. Antes do plano Real (1994-atualmente), o nome da nossa moeda era Cruzeiro Real (1993-1994) e antes disso era o Cruzeiro (1990-1993). 
// Criar um programa que converta uma quantia em Real, para Cruzeiro Real e Cruzeiro.
// Para transformar o Real em Cruzeiro Real, basta multiplicar o valor em reais por 2.750.
// Para transformar o Cruzeiro Real em Cruzeiro, basta multiplicar o valor por 1.000.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Digite um valor em reais: ");
            float num = obj.nextFloat();
            double cr = num * 2.750;
            double c = cr * 1.000;
            System.out.println("O equivalente é " + cr + " cruzeiros reais e " + c + " cruzeiros!");
        }
    }
}