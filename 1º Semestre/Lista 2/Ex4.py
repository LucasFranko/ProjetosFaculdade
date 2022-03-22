#Escreva um programa que leia dois números e que pergunte qual operação você deseja realizar.
#Você deve poder calcular a soma (+), subtração (-), multiplicação (*) e divisão (/).
#Exiba o resultado da operação solicitada.
num1=float(input("Digite um número: "));
num2=float(input("Digite outro número: "));
operacoes=("+ - * /");
print("Operações: + - * /");
calc=input("Digite a operação: ");
while calc!=operacoes:
    if (calc==("+")):
        print(num1+num2);
        break;
    elif (calc==("-")):
        print(num1-num2);
        break;
    elif (calc==("*")):
        print(num1*num2);
        break;
    elif (calc==("/")):
        print(num1/num2);
        break;
    else:
        print("Operações: + - * /");
        calc=input("Digite uma operação válida: ");