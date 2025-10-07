package codigosDeMenus;

import java.util.ArrayList;

public class ObjetoTopping {
    private ArrayList<String> ingredientes;
    public int id;
    private float precio;
    private String nombre;

    public ObjetoTopping() {
        this.ingredientes = new ArrayList<String>();
    }

    public ArrayList<String> getIngredientes() {
        return this.ingredientes;
    }

    public float getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}