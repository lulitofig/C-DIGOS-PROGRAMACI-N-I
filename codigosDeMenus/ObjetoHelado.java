package codigosDeMenus;

import java.util.ArrayList;

public class ObjetoHelado {
    public int id;
    public float precio;
    private float precioTopping;
    private ArrayList<String> sabores; // ese arreglo es privado y va a tener tipo string
    private ArrayList<String> toppings;
    private int tipo;

    // constructor de clase:
    public ObjetoHelado(int id, float precio, ArrayList<String> sabores, int tipo) {
        this.id = id;
        this.precio = precio;
        this.sabores = sabores;
        this.tipo = tipo;
        this.toppings = new ArrayList<String>();
        this.precioTopping = 500;
    }

    // metodos de clase
    public float calcularPrecio() {
        float precioTotal = 0;
        int nroToppings = this.toppings.size();
        precioTotal = this.precio + (this.precioTopping * nroToppings);// size es para arraylist y length es para array
        return precioTotal;
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

    public void addToppings(String toppingType) {
        this.toppings.add(toppingType);
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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

    public int getTipo() {
        return this.tipo;
    }

    public float getPrecioTopping() {
        return this.precioTopping;
    }
}
