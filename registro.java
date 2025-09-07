import java.util.Scanner;

public class registro {
    public static void main(String args[]) {
        String nombre = "";
        float salario = 0;
        char sexo = 0;
        String cargo = "";
        boolean activo = true;
        Scanner datos = new Scanner(System.in);
        menuUsuario();
        while (activo) {
            char opcion = menuUsuario();
            Scanner entrada = new Scanner(System.in);
            switch (opcion) {
                case '1':

                    System.out.println("Digite su nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Digite su salario:");
                    salario = entrada.nextFloat();
                    System.out.println("Digite M si es masculino y F si es femenino:");
                    sexo = entrada.next().charAt(0);
                    System.out.println("DIgite su cargo: ");
                    cargo = entrada.next();
                    break;
                case '2':
                    System.out.println("El nombre digitado es: " + nombre);
                    System.out.println("El salario digitado es: " + salario);
                    System.out.println("El sexo digitado es: " + sexo);
                    System.out.println("El cargo digitado es: " + cargo);
                    break;
                case '3':
                    editar();
                    int opcionEdicion = entrada.nextInt();
                    switch (opcionEdicion) {
                        case 1:
                            System.out.println("Su nombre es: " + nombre);
                            System.out.println("Digite su nuevo nombre:");
                            nombre = entrada.next();
                            break;
                        case 2:
                            System.out.println("Su salario es: " + salario);
                            System.out.println("Digite su nuevo salario:");
                            salario = entrada.nextFloat();
                            break;
                        case 3:
                            System.out.println("Su sexo es: " + sexo);
                            System.out.println("Digite su nuevo sexo:");
                            sexo = entrada.next().charAt(0);
                            break;
                        case 4:
                            System.out.println("Su cargo es: " + cargo);
                            System.out.println("Digite su nuevo cargo:");
                            cargo = entrada.next();
                            break;
                        case 5:
                            menuUsuario();
                            break;
                        case '4':
                            nombre = "";
                            salario = 0;
                            sexo = 0;
                            cargo = "";
                            System.out.println("Los datos se han borrado");
                            break;
                        case '5':
                            System.out.println("Ha decidido terminar");
                            activo = false;
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
            }

        }
    }

    public static char menuUsuario() {
        char opcion = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("|     REGISTRO DE USUARIOS      |");
        System.out.println("|                               |");
        System.out.println("| 1. Crear                      |");
        System.out.println("| 2. Leer                       |");
        System.out.println("| 3. Editar                     |");
        System.out.println("| 4. Borrar                     |");
        System.out.println("| 5. Terminar                   |");
        System.out.println("--------------------------------");
        System.out.println("Opcion----------->               ");
        String entrada = input.nextLine();
        opcion = entrada.charAt(0);
        return opcion;
    }

    public static void editar() {
        System.out.println("--------------------------------");
        System.out.println("|      EDICION DE USUARIOS      |");
        System.out.println("|                               |");
        System.out.println("| 1. Editar usuario             |");
        System.out.println("| 2. Editar salario             |");
        System.out.println("| 3. Editar sexo                |");
        System.out.println("| 4. Editar cargo               |");
        System.out.println("| 5. Cancelar                   |");
        System.out.println("--------------------------------");

    }

}
