package tp4;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private Continente continente;
    private List<Provincia> provincias;

    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
        this.provincias = new ArrayList<>();
        continente.agregarPais(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    @Override
    public String toString() {
        return "Pais: " + nombre;
    }
}