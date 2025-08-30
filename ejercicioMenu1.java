import java.util.Scanner;

public class ejercicioMenu1 {

    public static void main(String[] arg) {

        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("_________________________________________________");
        System.out.println("|                                               |");
        System.out.println("|              COMPRA TUS BOLETAS               |");
        System.out.println("|              PARA EL CONCIERTO                |");
        System.out.println("|                      DE                       |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|            ( M ¬ O ¬ R ¬ A ¬ T )              |");
        System.out.println("|            (♥--------♥--------♥)              |");
        System.out.println("|                                               |");
        System.out.println("|  PRECIOS:                                     |");
        System.out.println("| 1. VIP (Incluye Meet-Greet)                   |");
        System.out.println("| 2. Oriental (Incluye camiseta)                |");
        System.out.println("| 3. Occidental (Incluye camiseta)              |");
        System.out.println("| 4. Central (Incluye pulsera)                  |");
        System.out.println("| 5. Sur (No incluye nada)                      |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");
        System.out.println("|_______________________________________________|");

        System.out.println("¿Qué lugar quieres escoger?, digita el número que indica la ubicación");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("Escogiste VIP, tiene un costo de $1.200.000");
        }
        if (opcion == 2) {
            System.out.println("Escogiste Oriental, tiene un costo de $900.000");
        }
        if (opcion == 3) {
            System.out.println("Escogiste Occidental, tiene un costo de $900.000");
        }
        if (opcion == 4) {
            System.out.println("Escogiste Central, tiene un costo de $600.000");
        }
        if (opcion == 5) {
            System.out.println("Escogiste Sur, tiene un costo de $300.000");

        }

    }
}
