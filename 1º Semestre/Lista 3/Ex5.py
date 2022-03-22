#Escreva um programa que leia um conjunto de inteiros e, em seguida, imprima a soma dos inteiros pares e ímpares.
num=1;
cont=[];
cont1=[];
while num:
    num=int(input("Digite um número: "));
    if num==0:
        break;
    elif (num%2==0):
        cont.append(num);
    else:
        cont1.append(num);
soma=sum(cont);
soma1=sum(cont1);
print(soma);
print(soma1);