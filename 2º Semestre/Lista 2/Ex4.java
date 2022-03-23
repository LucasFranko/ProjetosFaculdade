// Fazer um programa para validar o CPF inserido pelo usuário é válido. O CPF é um número composto por 11 dígitos, em que os 2 últimos são dígitos verificadores. O número do CPF é escrito na forma ABCDEFGHI/JK ou diretamente como ABCDEFGHIJK, onde os algarismos não podem ser todos iguais entre si.
// O J é chamado 1° dígito verificador do número do CPF. O K é chamado 2° dígito verificador do número do CPF.
// Para obter J multiplicamos A, B, C, D, E, F, G, H e I pelas constantes correspondentes:
// A B C D E F G H I
// x10 x9 x8 x7 x6 x5 x4 x3 x2
// O resultado da soma, 10A + 9B + 8C + 7D + 6E + 5F + 4G + 3H + 2I, é dividido por 11. Analisamos então o RESTO dessa divisão: Se for 0 ou 1, o dígito J é [0] (zero). Se for 2, 3, 4, 5, 6, 7, 8, 9 ou 10, o dígito J é [11 - RESTO]
// Para obter K multiplicamos A, B, C, D, E, F, G, H, I e J pelas constantes correspondentes:
// A B C D E F G H I J
// x11 x10 x9 x8 x7 x6 x5 x4 x3 x2
// O resultado da soma, 11A + 10B + 9C + 8D + 7E + 6F + 5G + 4H + 3I + 2J, é dividido por 11. Verificamos então o RESTO dessa divisão: Se for 0 ou 1, o dígito K é [0] (zero). Se for 2, 3, 4, 5, 6, 7, 8, 9 ou 10, o dígito K é [11 - RESTO].

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            String CPF;

            System.out.printf("Informe um CPF: ");
            CPF = ler.next();

            System.out.printf("\nResultado: ");
                // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
            if (Main.isCPF(CPF) == true)
               System.out.printf("%s\n", Main.imprimeCPF(CPF));
            else System.out.printf("Negativo!\n" + "Erro, CPF invalido!");
        }

    }

    public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }

        public static String imprimeCPF(String CPF) {
            System.out.println("Positivo!");
            return("Seu CPF é: " + CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
            CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
        }
    }