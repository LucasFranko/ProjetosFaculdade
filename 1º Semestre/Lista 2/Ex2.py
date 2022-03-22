#Escreva um programa que leia três números e que imprima o maior e o menor.
num1=float(input("Escreva um número: "));
num2=float(input("Escreva outro número: "));
num3=float(input("Escreva o terceiro número: "))
if (num1>(num2 and num3)) and (num2<num3):
    print(f"O maior número é {num1} e o menor é {num2}");
elif (num1>(num2 and num3)) and (num3<num2):
    print(f"O maior número é {num1} e o menor é {num3}")

elif (num2>(num1 and num3)) and (num3<num1):
    print(f"O maior número é {num2} e o menor é {num3}")
elif (num2>(num1 and num3)) and (num1<num3):
    print(f"O maior número é {num2} e o menor é {num1}")

elif (num3>(num2 and num1)) and (num2<num1):
    print(f"O maior número é {num3} e o menor é {num2}")
else:
    print(f"O maior número é {num3} e o menor é {num1}");