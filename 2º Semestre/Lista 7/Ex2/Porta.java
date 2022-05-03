package Ex2;
// Crie uma classe Porta que suporta a criação de novos objetos (cópia). Ela deve ter os atributos altura (double), largura (double) e aberta (boolean). Também deve possuir os métodos abrir(), fechar() e os métodos getters correspondentes aos atributos. Como uma porta pode criar outras cópias dela mesma, você deve sobrescrever o método clone(), o qual deve criar um novo objeto com os valores dos atributos copiados e retorná-lo.

public class Porta {	
	private double altura;
	private double largura;
	private boolean aberta;
	
	public Porta(double altura, double largura, boolean aberta) {
		this.altura = altura;
		this.largura = largura;
		this.aberta = aberta;
	}
	
	public void abrir() {
		this.aberta = true;
	}
	
	public void fechar() {
		this.aberta = false;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public boolean getAberta() {
		return aberta;
	}
	
	@Override
	public Porta clone() {
		return new Porta(this.altura, this.largura, this.aberta);
	}	
}