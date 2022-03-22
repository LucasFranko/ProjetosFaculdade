#Construa um algoritmo que, dado o primeiro elemento a1 e a razão r de uma progressão aritmética (PA),
#imprima todos os n primeiros elementos da PA, onde a1, r e n são informados pelo usuário.
#Lembre-se que uma PA pode ser crescente ou decrescente.
a1=int(input("Digite um número: "));
r=int(input("Digite a razão: "));
n=int(input("Digite quantos números imprimir: "));
cont=1;
aux=a1+r;
print(aux);
while cont!=n:
    res=aux+r;
    aux=res;
    cont+=1;
    print(res);