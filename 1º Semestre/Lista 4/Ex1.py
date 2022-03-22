# Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume.
# v = 4/3 x PI x R³, com PI = 3,14.
r=float(input("Digite o raio da esfera em cm: "));
v=(4*3.14*r**3)/3;
print(f"O volume da esfera é {v}cm³");