package tp4;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nombre;
    private List<Pais> paises;

    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public List<Pais> getPaises() {
        return paises;
    }

    @Override
    public String toString() {
        return "Continente: " + nombre;
    }
}