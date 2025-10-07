package codigosDeMenus;

import java.util.ArrayList;

public class ObjetoPedido {
    private ArrayList<ObjetoHelado> listaHelados;
    private ArrayList<ObjetoMalteada> listaMalteadas;
    private ArrayList<ObjetoTopping> listaToppings;
    public int mesa;
    public float propina;

    // constructor
    public ObjetoPedido(int mesa) {
        this.mesa = mesa;
        this.listaHelados = new ArrayList<ObjetoHelado>();
        this.listaMalteadas = new ArrayList<ObjetoMalteada>();
        this.listaToppings = new ArrayList<ObjetoTopping>();
    }

    // metodos
    public float calcularCuenta() {
        float total = 0;
        for (ObjetoHelado helado : this.listaHelados) {
            total += helado.calcularPrecio();
        }
        for (ObjetoMalteada malteada : this.listaMalteadas) {
            total += malteada.calcularPrecio();
        }
        return total + this.propina;
    }

    // setters
    public void addObjetoHelado(ObjetoHelado producto) {
        this.listaHelados.add(producto);
    }

    public void addObjetoMalteada(ObjetoMalteada producto) {
        this.listaMalteadas.add(producto);
    }

    public void setPropina(float propina) {
        this.propina = propina;
    }
}
