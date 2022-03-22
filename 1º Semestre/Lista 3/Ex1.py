#Crie um algoritmo que, dado um número informado pelo usuário, imprima a tabuada dele de 1 a 10. Use o formato de apresentação (considerando que o usuário informou o número 5):
num=int(input("Digite um número: "));
tabuada=1;
while tabuada<11:
    print(num*tabuada);
    tabuada+=1;