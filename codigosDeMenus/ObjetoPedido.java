package codigosDeMenus;

import java.util.ArrayList;

public class ObjetoPedido {
    private ArrayList<ObjetoHelado> listaHelados;
    private ArrayList<ObjetoMalteada> listaMalteadas;
    public int mesa;
    public float propina;

    // constructor
    public ObjetoPedido(int mesa) {
        this.mesa = mesa;
        this.listaHelados = new ArrayList<ObjetoHelado>();
        this.listaMalteadas = new ArrayList<ObjetoMalteada>();
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
}
