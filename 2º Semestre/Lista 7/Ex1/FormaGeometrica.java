package Ex1;
// Crie uma classe abstrata FormaGeometrica com um método abstrato calcularArea() e crie classes de figuras geométricas quem herdam de FormaGeometrica e que implementam este método (Sendo Quadrado, Triangulo, Circunferência e Trapézio).  Depois crie uma classe com um método main() para exercitar as chamadas aos métodos que calculam a área, utilizando o polimorfismo.

public abstract class FormaGeometrica {    
    public abstract double calcularArea();    
}

class Quadrado extends FormaGeometrica {    
    private double lado;    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }    
}

class Triangulo extends FormaGeometrica {    
    private double base;
    private double altura;    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }    
}

class Circunferencia extends FormaGeometrica {    
    private double raio;    
    public Circunferencia(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }    
}

class Trapezio extends FormaGeometrica {    
    private double baseMaior;
    private double baseMenor;
    private double altura;    
    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) / 2) * altura;
    }    
}