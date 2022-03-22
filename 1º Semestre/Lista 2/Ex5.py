#Escreva um programa que calcule o preço a pagar pelo fornecimento de energia elétrica.
#Pergunte a quantidade de kWh consumida e o tipo de instalação: R para residências, I para indústrias e C para comércios.
#Calcule o preço a pagar de acordo com a tabela a seguir.
energia=int(input("Digite a quantidade de Kw/h: "));
inst=input("Digite o tipo de instalação (r = Residência, i = Indústria ou c = Comércio): ");
while inst!=("r", "i", "c"):
    if (energia<=500 and inst=='r'):
        print("O preço do Kw/h é R$0,40");
        break;
    elif (energia>500 and inst=='r'):
        print("O preço do Kw/h é R$0,65");
        break;
    elif (energia<=1000 and inst=='c'):
        print("O preço do Kw/h é R$0,55");
        break;
    elif (energia>1000 and inst=='c'):
        print("O preço do Kw/h é R$0,60");
        break;
    elif (energia<=5000 and inst=='i'):
        print("O preço do Kw/h é R$0,55");
        break;
    elif (energia>5000 and inst=='i'):
        print("O preço do Kw/h é 0,60");
        break;
    else:
        inst=input("Digite um dos tipos de instalação a seguir: (r = Residência, i = Indústria e c = Comércio): ");