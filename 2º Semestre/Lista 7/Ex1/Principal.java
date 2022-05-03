package Ex1;
public class Principal {
    	public static void main(String[] args) {
		FormaGeometrica f1 = new Quadrado(1);
		FormaGeometrica f2 = new Triangulo(1, 1);
		FormaGeometrica f3 = new Circunferencia(1);
		FormaGeometrica f4 = new Trapezio(1, 1, 1);
		
		System.out.println(f1.calcularArea());
		System.out.println(f2.calcularArea());
		System.out.println(f3.calcularArea());
		System.out.println(f4.calcularArea());
	}
}