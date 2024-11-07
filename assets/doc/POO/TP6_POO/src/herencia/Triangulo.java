package herencia;

public class Triangulo extends Figura {
    
    private Integer base;
    private Integer altura;

    public Triangulo(String nombre, String color, Integer base, Integer altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return (double) ((base * altura) / 2);
    }

    @Override
    public Double perimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "] " + super.toString();
    }
}
