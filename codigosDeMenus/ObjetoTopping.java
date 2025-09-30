package codigosDeMenus;

import java.util.ArrayList;

public class ObjetoTopping {
    public String nombre;
    public float precio;

    // constructor
    public ObjetoTopping(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // getters
    public String getNombre() {
        return this.nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

}
