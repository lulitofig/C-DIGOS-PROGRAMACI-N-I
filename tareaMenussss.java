import java.util.Scanner;

public class tareaMenussss {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int opcionPrincipal = 0;
        while (true) {
            menuPrincipal();
            System.out.println("Elija una opción: ");
            opcionPrincipal = entrada.nextInt();

            switch (opcionPrincipal) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    int opcionDos = 0;
                    while (true) {
                        menuDos();
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
                                int opcionTres = 0;
                                while (true) {
                                    menuTres();
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
                                            int opcionCuatro = 0;
                                            while (true) {
                                                menuCuatro();
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
        System.out.println("_________________________________________________");
        System.out.println("|                                               |");
        System.out.println("|            COMPRA TUS PRODUCTOS               |");
        System.out.println("|              PARA EL CONCIERTO                |");
        System.out.println("|                      DE                       |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|            ( M ¬ O ¬ R ¬ A ¬ T )              |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|                                               |");
        System.out.println("|  OPCIONES:                                    |");
        System.out.println("| 1. Boletos                                    |");
        System.out.println("| 2. Prendas                                    |");
        System.out.println("| 3. Accesorios                                 |");
        System.out.println("| 4. Maquillaje                                 |");
        System.out.println("| 5. Reservas                                   |");
        System.out.println("| 6. TERMINAR                                   |");
        System.out.println("|_______________________________________________|");

    }

    public static void menuDos() {
        System.out.println("_________________________________________________");
        System.out.println("|                                               |");
        System.out.println("|            COMPRA TUS PRODUCTOS               |");
        System.out.println("|              PARA EL CONCIERTO                |");
        System.out.println("|                      DE                       |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|            ( M ¬ O ¬ R ¬ A ¬ T )              |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|                                               |");
        System.out.println("|  ¿Qué mes desea adquirir sus productos?       |");
        System.out.println("| 1. Mayo                                       |");
        System.out.println("| 2. Junio                                      |");
        System.out.println("| 3. Julio                                      |");
        System.out.println("| 4. Agosto                                     |");
        System.out.println("| 5. TERMINAR                                   |");
        System.out.println("|_______________________________________________|");

    }

    public static void menuTres() {
        System.out.println("_________________________________________________");
        System.out.println("|                                               |");
        System.out.println("|            COMPRA TUS PRODUCTOS               |");
        System.out.println("|              PARA EL CONCIERTO                |");
        System.out.println("|                      DE                       |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|            ( M ¬ O ¬ R ¬ A ¬ T )              |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|                                               |");
        System.out.println("|  ¿De que color desea su colección?            |");
        System.out.println("| 1. Rosado                                     |");
        System.out.println("| 2. Amarillo                                   |");
        System.out.println("| 3. Rojo                                       |");
        System.out.println("| 4. TERMINAR                                   |");
        System.out.println("|_______________________________________________|");

    }

    public static void menuCuatro() {
        System.out.println("_________________________________________________");
        System.out.println("|                                               |");
        System.out.println("|            COMPRA TUS PRODUCTOS               |");
        System.out.println("|              PARA EL CONCIERTO                |");
        System.out.println("|                      DE                       |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|            ( M ¬ O ¬ R ¬ A ¬ T )              |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|                                               |");
        System.out.println("|  ¿Con que va a pagar?                         |");
        System.out.println("| 1. Efectivo                                   |");
        System.out.println("| 2. Nequi, DaviPlata, tarjeta                  |");
        System.out.println("| 3. TERMINAR                                   |");
        System.out.println("|_______________________________________________|");
    }
}
