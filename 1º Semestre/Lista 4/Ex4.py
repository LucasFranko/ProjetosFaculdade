# O código de César é uma das mais simples e conhecidas técnicas de criptografia.
# É um tipo de substituição na qual cada letra do texto e substituída por outra, que se apresenta no alfabeto abaixo dela um número fixo de vezes.
# Por exemplo, com uma troca de três posições, ‘A’ seria substituído por ‘D’, ‘B’ se tornaria ‘E’, e assim por diante.
# Implemente um programa que faça uso desse Código de César, entre com uma string e retorne a string codificada. Exemplo:
# String: a ligeira raposa marrom saltou sobre o cachorro cansado
# Nova string: D OLJHLUD UDSRVD PDUURP VDOWRX VREUH R FDFKRUUR FDQVDGR

alf='abcdefghijklmnopqrstuvwxyz';

texto=input('Digite o texto para criptografar: ');

cripto='';
anda=29;

for letras in texto.lower():
    for i in range(len(alf)):
            if letras == alf[i]:
                if i+anda<len(alf):
                    cripto+=alf[i+anda];
                else:
                    while i+anda>len(alf):
                        anda-=26;
                    cripto+=alf[i+anda];
print(cripto);