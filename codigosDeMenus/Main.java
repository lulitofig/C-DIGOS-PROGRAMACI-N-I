package codigosDeMenus;

import java.util.ArrayList;

public class Main {
    ArrayList<Heladeria> listaHeladerias = new ArrayList<Heladeria>();
    ArrayList<ObjetoHelado> listaHelados = new ArrayList<ObjetoHelado>();
    ArrayList<ObjetoMalteada> listaMalteadas = new ArrayList<ObjetoMalteada>();
    ArrayList<ObjetoTopping> listaToppings = new ArrayList<ObjetoTopping>();

    public static void main(String[] args) {
        Menu menuPpal = new Menu(40, '*', '1');
        ArrayList<String> options = new ArrayList<String>();
        options.add("Agregar heladeria");
        options.add("Ver heladeria");
        options.add("Editar heladeria");
        options.add("Eliminar heladeria");
        options.add("Terminar");
        menuPpal.createMenu(options, false);
    }
}
