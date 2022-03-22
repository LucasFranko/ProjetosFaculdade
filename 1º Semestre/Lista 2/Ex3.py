#Escreva um programa que pergunte o salário do funcionário e calcule o valor do aumento.
#Para salários superiores a R$ 1.250,00, calcule um aumento de 10%. Para os inferiores ou iguais, de 15%.
sal=float(input("Digite o salário: "));
if (sal>1250):
    aumentodez=((sal*0.1)+sal);
    print(f"Seu salário aumentou para {aumentodez}");
else:
    aumentoquinze=((sal*0.15)+sal);
    print(f"Seu salário aumentou para {aumentoquinze}");