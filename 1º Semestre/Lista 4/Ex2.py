# Faça um procedimento que recebe a idade de um nadador e retorna, a categoria desse nadador.
idade=int(input("Digite a sua idade: "));
ni=5-idade;
if idade<5:
    print(f"Você não sabe nadar, volte daqui {ni} anos");
elif idade>=5 and idade<=7:
    print("Você esta na categoria infantil A");
elif idade>=8 and idade<=10:
    print("Você esta na categoria infantil B");
elif idade>=11 and idade<=13:
    print("Você esta na categoria Juvenil A");
elif idade>=14 and idade<=17:
    print("Você esta na categoria Juvenil B");
else:
    print("Você esta na categoria adulto");