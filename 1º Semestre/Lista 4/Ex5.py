
# Escreva um programa para calcular a soma dos números que aparecem em uma determinada string.
# Se não houver números, gere uma exceção dizendo que a string não contém números.
# A string fornecida é: 15 é25 uma 20string
# A soma dos números na string é: 60

num = '';
soma = 0;

texto = input('Digite uma texto com números: ');

for i in texto:
    if i.isnumeric():
        num += i;
    
    elif num != '':
        soma += int(num);
        num = '';

print(f'A soma dos números presentes na texto é igual a {soma}');