package codigosDeMenus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Helpers {

    Boolean continuar = true;
    private static ArrayList<Heladeria> listaHeladerias = new ArrayList<Heladeria>();
    private ArrayList<ObjetoHelado> listaHelados = new ArrayList<ObjetoHelado>();
    private ArrayList<ObjetoMalteada> listaMalteadas = new ArrayList<ObjetoMalteada>();
    private ArrayList<ObjetoTopping> listaToppings = new ArrayList<ObjetoTopping>();

    public static List<?> crudGeneral(List<?> listaRecursos, String tituloMenu) {
        int opcion = 0;
        Scanner input = new Scanner(System.in);

        Menu menuCrud = new Menu(40, '-', '1');
        ArrayList<String> options = new ArrayList<String>();
        options.add("Crear");
        options.add("Ver");
        options.add("Editar");
        options.add("Eliminar");
        options.add("Volver");
        System.out.println(tituloMenu);
        // Averiguar a que clase (Heladeria, Helado, Maltaeada o Toppings) pertenece el
        // arreglo que entra como parametro
        Object primerElemento = listaRecursos.get(0); // Obtiene el primer elemento del arreglo
        if (primerElemento instanceof Heladeria) {
            System.out.println("Menu CRUD Heladeria");
            ArrayList<Heladeria> recursos = (ArrayList<Heladeria>) listaRecursos;
        } else if (primerElemento instanceof ObjetoHelado) {
            ArrayList<ObjetoHelado> recursos = (ArrayList<ObjetoHelado>) listaRecursos;
            System.out.println("Menu CRUD Helado");
        } else if (primerElemento instanceof ObjetoMalteada) {
            ArrayList<ObjetoMalteada> recursos = (ArrayList<ObjetoMalteada>) listaRecursos;
            System.out.println("Menu CRUD Malteada");
        } else if (primerElemento instanceof ObjetoTopping) {
            ArrayList<ObjetoTopping> recursos = (ArrayList<ObjetoTopping>) listaRecursos;
            System.out.println("Menu CRUD Toppings");
        } else {
            System.out.println("Menu CRUD General");
        }
        opcion = menuCrud.createMenu(options, false);

        switch (opcion) {
            case '1':
                crearHeladeria();
                verHeladeria();
                editarHeladeria();
                borrarHeladeria();
                break;
            case '2':
                crearHelado();
                verHelado();
                editarHelado();
                borrarHelado();
                break;
            case 3:
                crearMalteada();
                verMalteada();
                editarMalteada();
                borrarMalteada();
                break;
        }
        input.close();
        return listaHeladerias;
    }

    // CRUD DE HELADERIA

    public static Heladeria crearHeladeria() {
        Scanner input = new Scanner(System.in);
        System.out.println("Crear Heladeria");
        System.out.println("Escriba el ID de la Heladeria: ");
        int id = input.nextInt();
        System.out.println("Escriba la direccion de la Heladeria: ");
        String direccion = input.next();
        input.close();
        return new Heladeria(id, direccion);
    }

    public static Heladeria verHeladeria() {
        System.out.println("Ver Heladeria");
        System.out.println("Escriba el ID de la Heladeria: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el arraylist
        boolean encontrado = false;
        for (Heladeria heladeria : listaHeladerias) {
            if (heladeria.id == id) {
                System.out.println("ID: " + heladeria.id);
                System.out.println("Direccion: " + heladeria.getDireccion());
                System.out.println("Helados disponibles: " + heladeria.getListaHeladosDisponibles());
                System.out.println("Malteadas disponibles: " + heladeria.getListaMalteadasDisponibles());
                System.out.println("Toppings: " + heladeria.getListaToppings());
                System.out.println("Pedidos: " + heladeria.getListaPedidos());
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontro la heladeria");
        }
    }

    public static Heladeria editarHeladeria() {
        Scanner input = new Scanner(System.in);
        System.out.println("Editar Heladeria");
        System.out.println("Escriba el ID de la Heladeria: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el arraylist
        boolean encontrado = false;
        for (Heladeria heladeria : listaHeladerias) {
            if (heladeria.id == id) {
                System.out.println("ID: " + heladeria.id);
                System.out.println("Direccion: " + heladeria.getDireccion());
                System.out.println("Helados disponibles: " + heladeria.getListaHeladosDisponibles());
                System.out.println("Malteadas disponibles: " + heladeria.getListaMalteadasDisponibles());
                System.out.println("Toppings: " + heladeria.getListaToppings());
                System.out.println("Pedidos: " + heladeria.getListaPedidos());
                System.out.println("Escriba la nueva direccion de la Heladeria: ");
                String nuevaDireccion = input.next();
                heladeria.setDireccion(nuevaDireccion);
                System.out.println("Heladeria actualizada");
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontro la heladeria");
        }
    }

    public static int borrarHeladeria() {
        Scanner input = new Scanner(System.in);
        System.out.println("Borrar Heladeria");
        System.out.println("Escriba el ID de la Heladeria que desea borrar: ");
        int id = input.nextInt();
        boolean encontrado = false;
        for (Heladeria heladeria : listaHeladerias) {
            if (heladeria.getId() == id) {
                heladeria.setDireccion("");
                heladeria.setListaHeladosDisponibles(new ArrayList<ObjetoHelado>());
                heladeria.setListaMalteadasDisponibles(new ArrayList<ObjetoMalteada>());
                heladeria.setListaToppings(new ArrayList<ObjetoTopping>());
                heladeria.setListaPedidos(new ArrayList<ObjetoPedido>());
                encontrado = true;
                System.out.println("La healderia se ha borrado correctamente.");
                return 1; // devuelve 1 si se pudo borrar
            }
        }
        System.out.println("No se encontró la heladeria");
        return -2; // la heladeria no existe entonces no se puede borrar
    }

    // CRUD HELADOS
    public ObjetoHelado crearHelado() {
        Scanner input = new Scanner(System.in);
        System.out.println("Crear Helado");
        System.out.println("Escriba el ID del Helado: ");
        int id = input.nextInt();
        System.out.println("Escriba el nombre del helado: ");
        String nombre = input.next();
        System.out.println("Escriba el precio de helado");
        float precio = input.nextFloat();

        ArrayList<String> sabores = new ArrayList<String>();
        while (continuar) {
            System.out.println("Escriba el sabor del helado");
            String sabor = input.next();
            sabores.add(sabor);
            System.out.println("Su sabor ya ha sido registardo");
            System.out.println("Desea agregar otro sabor? (s/n)");
            String respuesta = input.next();
            if (respuesta == "n") {
                continuar = false;
            }
        }
        System.out.println("Digite el tipo de helado (1: conito, 2: vaso, 3: paleta): ");
        int tipo = input.nextInt();
        return new ObjetoHelado(id, nombre, precio, sabores, tipo);
    }

    public static void verHelado() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ver helado");
        System.out.println("Escriba el ID del helado: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el ArrayList
        boolean encontrado = false;
        for (ObjetoHelado helado : listaHelados) {
            if (helado.getId() == id) {
                System.out.println("ID: " + helado.getId());
                System.out.println("Nombre: " + helado.getNombre());
                System.out.println("Precio: " + helado.getPrecio());
                System.out.println("Sabores: " + helado.getSabores());
                System.out.println("Tipo: " + helado.getTipo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se pudo encontrar el helado");
        }
    }

    public static void editarHelado() {
        Scanner input = new Scanner(System.in);
        System.out.println("Editar Helado");
        System.out.println("Escriba el ID del helado: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el ArrayList
        boolean encontrado = false;
        for (ObjetoHelado helado : listaHelados) {
            if (helado.getId() == id) {
                System.out.println("ID: " + helado.getId());
                System.out.println("Nombre: " + helado.getNombre());
                System.out.println("Precio: " + helado.getPrecio());
                System.out.println("Sabores: " + helado.getSabores());
                System.out.println("Tipo: " + helado.getTipo());
                System.out.println("Escriba el nuevo nombre del helado: ");
                String nuevoNombre = input.next();
                helado.setNombre(nuevoNombre);
                System.out.println("Escriba el nuevo precio del helado: ");
                float nuevoPrecio = input.nextFloat();
                helado.setPrecio(nuevoPrecio);
                System.out.println("Helado actualizado");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el helado");
        }
    }

    public static int borrarHelado() {
        Scanner input = new Scanner(System.in);
        System.out.println("Borrar Helado");
        System.out.println("Escriba el ID del helado que desea borrar: ");
        int id = input.nextInt();
        boolean encontrado = false;
        for (ObjetoHelado helado : listaHelados) {
            if (helado.getId() == id) {
                helado.setNombre("");
                helado.setPrecio(0);
                helado.setSabores(new ArrayList<String>());
                helado.setTipo(0);
                encontrado = true;
                System.out.println("El helado se ha borrado correctamente (datos puestos en cero).");
                return 1; // borrado exitoso
            }
        }
        System.out.println("No se encontró el helado");
        return -2; // el helado no existe entonces no se puede borrar
    }

    // CRUD MALTEADAS
    public ObjetoMalteada crearMalteada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Crear Malteada");
        System.out.println("Escriba el ID de la malteada: ");
        int id = input.nextInt();
        System.out.println("Escriba el sabor de la malteada");
        String sabor = input.next();
        ArrayList<String> sabores = new ArrayList<String>();
        sabores.add(sabor);
        System.out.println("Su sabor ya ha sido registardo");
        System.out.println("Escriba el precio de la malteada: ");
        float precio = input.nextFloat();
        input.close();
        return new ObjetoMalteada(id, precio, sabores);
    }

    public static verMalteada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ver Malteada");
        System.out.println("Escriba el ID de la malteada: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el ArrayList
        boolean encontrado = false;
            for (ObjetoMalteada malteada : listaMalteadas) {
                if (malteada.getId() == id) {
                    System.out.println("ID: " + malteada.getId());
                    System.out.println("Precio: " + malteada.getPrecio());
                    System.out.println("Sabores: " + malteada.getSabores());
                encontrado = true;
        break;
    }
}

    public static editarMalteada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Editar Malteada");
        System.out.println("Escriba el ID de la malteada: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el ArrayList
        boolean encontrado = false;
            for (ObjetoMalteada malteada : listaMalteadas) {
                if (malteada.getId() == id) {
                    System.out.println("ID: " + malteada.getId());
                    System.out.println("Precio: " + malteada.getPrecio());
                    System.out.println("Sabores: " + malteada.getSabores());
                    System.out.println("Escriba el nuevo precio de la malteada: ");
                    float nuevoPrecio = input.nextFloat();
                    malteada.setPrecio(nuevoPrecio);
                    System.out.println("Malteada actualizada");
                encontrado = true;
            break;
        }
    }   
}

    public static int borrarMalteada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Borrar Malteada");
        System.out.println("Escriba el ID de la malteada que desea borrar: ");
        int id = input.nextInt();
        boolean encontrado = false;
        for (ObjetoMalteada malteada : listaMalteadas) {
            if (malteada.getId() == id) {
                malteada.setPrecio(0);
                malteada.setSabores(new ArrayList<String>());
                encontrado = true;
                System.out.println("La malteada se ha borrado correctamente (datos puestos en cero).");
                return 1; // borrado exitoso
            }
        }
        System.out.println("No se encontró la malteada");
        return -2; // la malteada no existe entonces no se puede borrar
    }

 }

    // CRUD TOPPINGS
    public ObjetoTopping crearTopping() {
        Scanner input = new Scanner(System.in);
        System.out.println("Crear Topping");
        System.out.println("Escriba el ID del Topping: ");
        int id = input.nextInt();
        System.out.println("Escriba el nombre del Topping: ");
        String nombre = input.next();
        System.out.println("Escriba el precio del Topping: ");
        float precio = input.nextFloat();
        input.close();
        return new ObjetoTopping(id, nombre, precio);
    }

    public static verTopping() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ver Topping");
        System.out.println("Escriba el ID del Topping: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el ArrayList
        boolean encontrado = false;
            for (ObjetoTopping topping : listaToppings) {
                if (topping.getId() == id) {
                    System.out.println("ID: " + topping.getId());
                    System.out.println("Nombre: " + topping.getNombre());
                    System.out.println("Precio: " + topping.getPrecio());
                encontrado = true;
        break;
    }
    if (!encontrado) {
        System.out.println("No se pudo encontrar el topping");
    }

    public static editarTopping() {
        Scanner input = new Scanner(System.in);
        System.out.println("Editar Topping");
        System.out.println("Escriba el ID del Topping: ");
        int id = input.nextInt(); // lee el ID que se va a buscar en el ArrayList
        boolean encontrado = false;
            for (ObjetoTopping topping : listaToppings) {
                if (topping.getId() == id) {
                    System.out.println("ID: " + topping.getId());
                    System.out.println("Nombre: " + topping.getNombre());
                    System.out.println("Precio: " + topping.getPrecio());
                    System.out.println("Escriba el nuevo nombre del Topping: ");
                    String nuevoNombre = input.next();
                    topping.setNombre(nuevoNombre);
                    System.out.println("Escriba el nuevo precio del Topping: ");
                    float nuevoPrecio = input.nextFloat();
                    topping.setPrecio(nuevoPrecio);
                    System.out.println("Topping actualizado");
                encontrado = true;
            break;
                    }
    }
                if (!encontrado) {
                     System.out.println("No se encontro el Topping");
                }
            }

    public static int borrarTopping() {
        Scanner input = new Scanner(System.in);
        System.out.println("Borrar Topping");
        System.out.println("Escriba el ID del Topping que desea borrar: ");
        int id = input.nextInt();
        boolean encontrado = false;
        for (ObjetoTopping topping : listaToppings) {
            if (topping.getId() == id) {
                topping.setNombre("");
                topping.setPrecio(0);
                encontrado = true;
                System.out.println("El Topping se ha borrado correctamente ");
                return 1; // borrado exitoso
            }
            return -2; // el Topping no existe entonces no se puede borrar

        }
    }
}}
