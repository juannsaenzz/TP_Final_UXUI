package tp5;

public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos() {
        puntos++;
    }

    public void reiniciarPuntos() {
        puntos = 0;
    }
}