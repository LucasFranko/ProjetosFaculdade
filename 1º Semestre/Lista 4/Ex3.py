# Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade expressa em dias.
# Considere um ano = 365 dias e um mês = 30 dias.
idade=int(input("Digite sua idade em anos: "));
idade1=int(input("Digite a quantos meses foi seu aniversário: "));
idade2=int(input("Digite a quantos dias foi seu aniversário: "));
dias=(idade*365)+(idade1*30)+idade2;
print(f"Você ja viveu {dias} dias");