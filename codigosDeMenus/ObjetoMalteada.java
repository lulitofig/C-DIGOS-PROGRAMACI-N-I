package codigosDeMenus;

import java.util.ArrayList;

public class ObjetoMalteada {
    public int id;
    public float precio;
    private float precioTopping;
    private ArrayList<String> sabores; // ese arreglo es privado y va a tener tipo string
    private ArrayList<String> toppings;

    public ObjetoMalteada(int id, float precio, ArrayList<String> sabores) {
        this.id = id;
        this.precio = precio;
        this.sabores = sabores;
        this.toppings = new ArrayList<String>();
        this.precioTopping = 100;
    }

    // metodos de clase
    public float calcularPrecio() {
        return this.precio + (this.precioTopping * this.toppings.size());
    }

    // setters
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setPrecioTopping() {
        this.precioTopping = precioTopping;
    }

    public void setSabores(ArrayList<String> sabores) {
        this.sabores = sabores;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    // getters
    public float getPrecio() {
        return this.precio;
    }

    public ArrayList<String> getSabores() {
        return this.sabores;
    }

    public ArrayList<String> getToppings() {
        return this.toppings;
    }

    public float getPrecioTopping() {
        return this.precioTopping;
    }
}
