package codigosDeMenus;

import java.util.ArrayList;

public class Main {
    public boolean ejecutando;
    public boolean enCRUD;

    // las heladeria recursos etc al ser estaicas en los helpers, no se definen aqui
    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        boolean ejecutando = true;
        Menu menuPrincipal = new Menu(50, '=', 1);
        ArrayList<String> options = new ArrayList<>();
        options.add("Administrar Heladerias");
        options.add("Administrar Helados");
        options.add("Administrar Malteadas");
        options.add("Administrar Toppings");
        options.add("Salir del Programa");
        System.out.println(" BIENVENIDO AL SISTEMA DE HELADERÍA ");
        while (ejecutando) {
            // createMenu se encarga de dibujar el menú, leer la opción y validarla.
            int seleccion = menuPrincipal.createMenu(options, true); // true para centrar
            switch (seleccion) {
                case 1: // Administrar heladerias
                    ejecutarCRUD("Heladeria", 1);// los numeros son para identificar el tipo de recurso y poder
                                                 // reutilizar el mismo metodo
                    break;
                case 2: // Administrar helados
                    ejecutarCRUD("Helado", 2);
                    break;
                case 3: // Administrar malteadas
                    ejecutarCRUD("Malteada", 3);
                    break;
                case 4: // Administrar toppingd
                    ejecutarCRUD("Topping", 4);
                    break;
                case 5: // Salir
                    ejecutando = false;
                    System.out.println("Gracias");
                    break;
                default:
                    // El menu en las opciones ya se hace pero igual se incluye para prevenir
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static void ejecutarCRUD(String titulo, int idTipoRecurso) {
        // Creamos un nuevo menú para el CRUD
        Menu menuCrud = new Menu(40, '-', 1);
        ArrayList<String> options = new ArrayList<>();
        options.add("Crear " + titulo);
        options.add("Ver " + titulo);
        options.add("Editar " + titulo);
        options.add("Eliminar " + titulo);
        options.add("Volver al menú principal");
        boolean enCRUD = true;
        while (enCRUD) {
            System.out.println("crud");
            switch (idTipoRecurso) {
                case 1: // Heladeria
                    switch (accion) {
                        case 1:
                            Helpers.crearHeladeria();
                            break;
                        case 2:
                            Helpers.verHeladeria();
                            break;
                        case 3:
                            Helpers.editarHeladeria();
                            break;
                        case 4:
                            Helpers.borrarHeladeria();
                            break;
                        case 5:
                            enCRUD = false; // salir, cancelar o temrinar
                            break;
                    }
                    break;
                case 2: // Helado
                    switch (accion) {
                        case 1:
                            Helpers.crearHelado();
                            break;
                        case 2:
                            Helpers.verHelado();
                            break;
                        case 3:
                            Helpers.editarHelado();
                            break;
                        case 4:
                            Helpers.borrarHelado();
                            break;
                        case 5:
                            enCRUD = false;// salir, cancelar o temrinar
                            break;
                    }
                    break;
                case 3: // Malteada
                    switch (accion) {
                        case 1:
                            Helpers.crearMalteada();
                            break;
                        case 2:
                            Helpers.verMalteada();
                            break;
                        case 3:
                            Helpers.editarMalteada();
                            break;
                        case 4:
                            Helpers.borrarMalteada();
                            break;
                        case 5:
                            enCRUD = false;// salir, cancelar o temrinar
                            break;
                    }
                    break;
                case 4: // Topping
                    switch (accion) {
                        case 1:
                            Helpers.crearTopping();
                            break;
                        case 2:
                            Helpers.verTopping();
                            break;
                        case 3:
                            Helpers.editarTopping();
                            break;
                        case 4:
                            Helpers.borrarTopping();
                            break;
                        case 5:
                            enCRUD = false;// salir, cancelar o temrinar
                            break;
                    }
                    break;
                default:
                    System.out.println("Tipo de recurso inválido.");
                    enCRUD = false; // Salir del CRUD si el tipo de recurso es inválido
                    break;
            }
        }
    }
}