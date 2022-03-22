#Escreva um programa para encontrar o valor fatorial de um número n digitado pelo usuário.
#O fatorial de um número n é da forma n! = n * (n -1) * (n - 2) * ... * 2 * 1
num=int(input("Digite um número: "));
n=num-1;
cont=num*n;
res=cont;
while n!=1:
    cont=res;
    n-=1;
    res=cont*n;
print(res);