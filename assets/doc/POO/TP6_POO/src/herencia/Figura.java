package herencia;

public abstract class Figura {

    private String nombre;
    private String color;
    private Punto centro;

    public Figura(String nombre, String color, Punto centro) {
        this.nombre = nombre;
        this.color = color;
        this.centro = centro;
    }

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.centro = new Punto(0, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void mover(int nuevoX, int nuevoY) {
        this.centro.setX(nuevoX);
        this.centro.setY(nuevoY);
    }

    public abstract Double area();

    public abstract Double perimetro();

    @Override
    public String toString() {
        return "Figura [nombre=" + nombre + ", color=" + color + ", centro=" + centro + "]";
    }
}