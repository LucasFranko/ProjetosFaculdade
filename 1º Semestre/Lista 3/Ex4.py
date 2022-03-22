#Escrever um algoritmo que leia uma quantidade números inseridos pelo usuário e conte quantos deles estão nos seguintes intervalos:
#[0-25], [26-50], [51-75] e [76-100].
#A entrada de dados deve terminar quando for lido um número negativo.
num=1;
cont=[];
while num:
    num=float(input("Digite um número: "));
    if (num==0):
        break;
    cont.append(num);
for x in cont:
    if (x<26):
        print(f"Estes números estão entre[0-25] {x}");
    elif(x>25.9) and (x<51):
        print(f"Estes números estão entre[26-50] {x}");
    elif(x>50.9) and (x<76):
        print(f"Estes números estão entre[51-75] {x}");
    elif(x>75.9) and (x<100.1):
        print(f"Estes números estão entre[75-100] {x}");