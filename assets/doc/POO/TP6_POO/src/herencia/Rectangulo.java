package herencia;

public class Rectangulo extends Figura {

    private Integer base;
    private Integer altura;

    public Rectangulo(String nombre, String color, Punto centro, Integer base, Integer altura) {
        super(nombre, color, centro);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String nombre, String color, Integer base, Integer altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public Double area() {
        return (double) (base * altura);
    }

    @Override
    public Double perimetro() {
        return 2.0 * (base + altura);
    }

    public void cambiarTamaño(double factorEscala) {
        if (factorEscala > 0) {
            this.base = (int) (base * factorEscala);
            this.altura = (int) (altura * factorEscala);
        }
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "] " + super.toString();
    }
}
