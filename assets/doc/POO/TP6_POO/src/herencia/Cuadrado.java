package herencia;

public class Cuadrado extends Rectangulo {

    public Cuadrado(String nombre, String color, Punto centro, Integer lado) {
        super(nombre, color, centro, lado, lado);
    }

    public Cuadrado(String nombre, String color, Integer lado) {
        super(nombre, color, lado, lado);
    }

    public Integer getLado() {
        return super.getBase();
    }

    public void setLado(Integer lado) {
        super.setBase(lado);
        super.setAltura(lado);
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + getLado() + "] " + super.toString();
    }
}
