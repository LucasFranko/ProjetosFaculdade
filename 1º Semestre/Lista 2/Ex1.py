#Escreva um programa que pergunte a velocidade do carro de um usuário.
#Caso ultrapasse 80 km/h, exiba uma mensagem dizendo que o usuário foi multado.
#Nesse caso, exiba o valor da multa, cobrando R$ 5 por km acima de 80 km/h.
velo=float(input("Escreva a velocidade do carro em Km/h: "));
if (velo>80):
    multa=((velo-80)*5);
    print(f"Você foi multado em {multa} reais");
else:
    print("Você não foi multado");