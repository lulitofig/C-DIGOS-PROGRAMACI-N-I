package codigosDeMenus;

import java.util.ArrayList;

public class Heladeria {
    public int id;
    public String direccion;
    private ArrayList<ObjetoHelado> listaHeladosDisponibles;
    private ArrayList<ObjetoMalteada> listaMalteadasDisponibles;
    private ArrayList<ObjetoPedido> listaPedidos;
    private ArrayList<ObjetoTopping> listaToppings;

    // Constructor de clase
    public Heladeria(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
        this.listaHeladosDisponibles = new ArrayList<ObjetoHelado>();
        this.listaMalteadasDisponibles = new ArrayList<ObjetoMalteada>();
        this.listaPedidos = new ArrayList<ObjetoPedido>();
        this.listaToppings = new ArrayList<ObjetoTopping>();
    }

    // Metodos de clase
    // setters
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setListaHeladosDisponibles(ArrayList<ObjetoHelado> lista) {
        this.listaHeladosDisponibles = lista;
    }

    public void setListaMalteadasDisponibles(ArrayList<ObjetoMalteada> lista) {
        this.listaMalteadasDisponibles = lista;
    }

    public void setListaToppings(ArrayList<ObjetoTopping> lista) {
        this.listaToppings = lista;
    }

    public void addListaPedidos(ObjetoPedido pedido) {
        this.listaPedidos.add(pedido);
    }

    // getters
    public String getDireccion() {
        return this.direccion;
    }

    public ArrayList<ObjetoHelado> getListaHeladosDisponibles() {
        return this.listaHeladosDisponibles;
    }

    public ArrayList<ObjetoMalteada> getListaMalteadasDisponibles() {
        return this.listaMalteadasDisponibles;
    }

    public ArrayList<ObjetoPedido> getListaPedidos() {
        return this.listaPedidos;
    }

    public ArrayList<ObjetoTopping> getListaToppings() {
        return this.listaToppings;
    }
}