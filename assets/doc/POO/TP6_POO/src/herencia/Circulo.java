package herencia;

public class Circulo extends Elipse {

    public Circulo(String nombre, String color, Punto centro, Integer radio) {
        super(nombre, color, centro, radio, radio);
    }

    public Circulo(String nombre, String color, Integer radio) {
        super(nombre, color, radio, radio);
    }

    public Integer getRadio() {
        return super.getRadioMayor();
    }

    public void setRadio(Integer radio) {
        super.setRadioMayor(radio);
        super.setRadioMenor(radio);
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + getRadio() + "] " + super.toString();
    }
}
