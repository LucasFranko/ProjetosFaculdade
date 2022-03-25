package Ex1;

public class Venda {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.placa = "ABC-1234";
        car.cor = "Preto";
        car.modelo = "Fusca";
        car.marca = "Volkswagen";
        car.preco = 10000;
        car.ano = 1980;

        Cliente.nome = "João";
        Cliente.email = "João@gmail.com";
        Cliente.cpf = "123.456.78-90";
        Cliente.rg = 987654321;
        Cliente.telefone = "(12)98745632";
        Cliente.data = "24/03/2222";

        car.Carros();
    }
}
