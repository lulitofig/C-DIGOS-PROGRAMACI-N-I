package codigosDeMenus;

import java.util.Scanner;

public class menuHelados {

    public static int opcionPrincipal = 0;
    public static int opcionDos = 0;
    public static int opcionTres = 0;
    public static int opcionCuatro = 0;

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            menusUnidos(1);
            System.out.println("Elija una opción: ");
            opcionPrincipal = entrada.nextInt();

            switch (opcionPrincipal) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    while (true) {
                        menusUnidos(2);
                        System.out.println("Elija una opción: ");
                        opcionDos = entrada.nextInt();
                        if (opcionDos == 5) {
                            System.out.println("Menu principal...");
                            break;
                        }
                        switch (opcionDos) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                while (true) {
                                    menusUnidos(3);
                                    System.out.println("Elija una opción: ");
                                    opcionTres = entrada.nextInt();
                                    if (opcionTres == 4) {
                                        System.out.println("Menú principal...");
                                        break;
                                    }
                                    switch (opcionTres) {
                                        case 1:
                                        case 2:
                                        case 3:
                                            while (true) {
                                                menusUnidos(4);
                                                System.out.println("Elija una opción");
                                                opcionCuatro = entrada.nextInt();
                                                if (opcionCuatro == 3) {
                                                    System.out.println("Menu principal:");
                                                    break;
                                                }
                                                switch (opcionCuatro) {
                                                    case 1:
                                                        System.out.println("Gracias por comprar");
                                                        break;
                                                    case 2:
                                                        System.out.println("Gracias por comprar");
                                                        break;
                                                    default:
                                                        System.out.println("Opción no valida");
                                                        continue;
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Opción no valida");
                                            continue;
                                    }
                                    break;
                                }
                                break;
                            default:
                                System.out.println("Opción no valida");
                                continue;
                        }
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Gracias por su compra");
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("________________________________");
        System.out.println("|                              |");
        System.out.println("|       POO-PY HELADERIA       |");
        System.out.println("|                              |");
        System.out.println("|  Menú Heladería Poo-Py       |");
        System.out.println("|                              |");
        System.out.println("|  OPCIONES:                   |");
        System.out.println("| 1. Conos                     |");
        System.out.println("| 2. Copas de Helado           |");
        System.out.println("| 3. Ensalada  de frutas       |");
        System.out.println("| 4. Malteadas                 |");
        System.out.println("| 5. Litro de Helado           |");
        System.out.println("| 6. TERMINAR                  |");
        System.out.println("|______________________________|");

    }

    public static void menuDos() {
        System.out.println("________________________________");
        System.out.println("|                              |");
        System.out.println("|       POO-PY HELADERIA       |");
        System.out.println("|                              |");
        System.out.println("|  Menú Heladería Poo-Py       |");
        System.out.println("|                              |");
        System.out.println("|  Sabores:                    |");
        System.out.println("| 1. Maracuýa                  |");
        System.out.println("| 2. Vainilla Chips            |");
        System.out.println("| 3. Chocolate                 |");
        System.out.println("| 4. Fresa                     |");
        System.out.println("| 5. TERMINAR                  |");
        System.out.println("|______________________________|");

    }

    public static void menuTres() {
        System.out.println("________________________________");
        System.out.println("|                              |");
        System.out.println("|       POO-PY HELADERIA       |");
        System.out.println("|                              |");
        System.out.println("|  Menú Heladería Poo-Py       |");
        System.out.println("|                              |");
        System.out.println("|  Acompañantes:               |");
        System.out.println("| 1. Galleta                   |");
        System.out.println("| 2. Gomita                    |");
        System.out.println("| 3. Chips                     |");
        System.out.println("| 4. TERMINAR                  |");
        System.out.println("|______________________________|");
    }

    public static void menuCuatro() {

        System.out.println("________________________________");
        System.out.println("|                              |");
        System.out.println("|       POO-PY HELADERIA       |");
        System.out.println("|                              |");
        System.out.println("|  Menú Heladería Poo-Py       |");
        System.out.println("|                              |");
        System.out.println("|  Pagos:                      |");
        System.out.println("| 1. Efectivo                  |");
        System.out.println("| 2. Pagos virtuales           |");
        System.out.println("| 3. TERMINAR                  |");
        System.out.println("|______________________________|");
    }

    public static void menusUnidos(int nivel) {
        switch (nivel) {
            case 1:
                menuPrincipal();
                break;
            case 2:
                menuDos();
                break;
            case 3:
                menuTres();
                break;
            case 4:
                menuCuatro();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
