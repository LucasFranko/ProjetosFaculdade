#Escreva um programa que leia a quantidade de dias, horas, minutos e segundos do usuário. Calcule o total em segundos.
d=int(input("Escreva a quantidade de dias: "));
h=int(input("Escreva a quantidade de horas: "));
m=int(input("Escreva a quantidade de minutos: "));
s=int(input("Escreva a quantidade de segundos: "));
t=((d*86400)+(h*3600)+(m*60)+s);
print(f"Este é todo tempo gasto em segundo: {t}");