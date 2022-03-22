#Faça um programa que dados três valores X, Y e Z, verifica se eles podem ser os comprimentos dos lados de um triângulo e, se forem,
#verificar se é um triângulo equilátero, isósceles ou escaleno. Caso eles não formem um triângulo, escreva uma mensagem.
#• Para verificar se as três medidas formam um triângulo, cada soma entre as medidas de dois lados deve ser maior que a terceiro lado.
#o Lado A + Lado B > Lado C
#o Lado A + Lado C > Lado B
#o Lado B + Lado C > Lado A
x=float(input("Escreva um valor: "));
y=float(input("Escreva o segundo valor: "));
z=float(input("Escreva o terceiro valor: "));
while (x==0 or y==0 or z==0):
    print("Os valores não formam um triângulo, digite outros valores");
    x=float(input("Escreva um valor: "));
    y=float(input("Escreva o segundo valor: "));
    z=float(input("Escreva o terceiro valor: "));
if x+y>z or y+z>x or z+x>y:
    if (x==y and y==z and z==x):
        print("O triângulo é equilátero");
    elif (x==y or y==z or z==x):
        print("O triângulo é isósceles");
    else:
        print("O triângulo é escaleno");