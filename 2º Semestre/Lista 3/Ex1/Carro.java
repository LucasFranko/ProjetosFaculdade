package Ex1;

public class Carro {
    String placa;
    String cor;
    String modelo;
    String marca;
    int preco;
    int ano;

    public void Carros() {
        System.out.println("A cor do carro é: " + cor +
                "\nO modelo do carro é: " + modelo +
                "\nA marca do carro é: " + marca +
                "\nO ano do carro é: " + ano +
                "\nO preço do carro é: " + preco +
                "\nA placa do carro é: " + placa +
                "\nO nome do dono é: " + Cliente.nome +
                "\nO email do dono é: " + Cliente.email +
                "\nO CPF do dono é: " + Cliente.cpf +
                "\nO RG do dono é: " + Cliente.rg +
                "\nO telefone do dono é: " + Cliente.telefone +
                "\nA data de nascimento do dono é: " + Cliente.data);
    }
}