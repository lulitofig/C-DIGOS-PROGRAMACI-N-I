import java.util.Scanner;

public class segundoRegistro {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el número de registros que desea hacer:");
        int n = entrada.nextInt();
        entrada.nextLine();
        String[] arNombres = new String[n];
        float[] arSalarios = new float[n];
        char[] arSexos = new char[n];
        String[] arCargos = new String[n];
        int cantidad = 0;
        boolean activo = true;
        while (activo) {
            char opcion = menuUsuario();
            switch (opcion) {
                case '1':
                    if (cantidad < n) {
                        System.out.println("Digite su nombre:");
                        arNombres[cantidad] = entrada.nextLine();
                        System.out.println("Digite su salario:");
                        arSalarios[cantidad] = entrada.nextFloat();
                        System.out.println("Digite M si es masculino y F si es femenino:");
                        arSexos[cantidad] = entrada.nextLine().charAt(0);
                        System.out.println("Digite su cargo:");
                        arCargos[cantidad] = entrada.nextLine();
                        cantidad++;
                    } else {
                        System.out.println("No hay espacio para más registros");
                    }
                    break;
                case '2':
                    if (cantidad == 0) {
                        System.out.println("No ha digitado ningun registro");
                    } else {
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println("Registro #" + (i + 1));
                            System.out.println("Nombre: " + arNombres[i]);
                            System.out.println("Salario: " + arSalarios[i]);
                            System.out.println("Sexo: " + arSexos[i]);
                            System.out.println("Cargo: " + arCargos[i]);
                        }
                    }
                    break;
                case '3':
                    if (cantidad == 0) {
                        System.out.println("No hay registros para editar");
                    } else {
                        System.out.println("Posición que va a editar: (1-" + cantidad + ")");
                        int idx = entrada.nextInt() - 1;
                        entrada.nextLine();
                        if (idx >= 0 && idx < cantidad) {
                            editar();
                            int opcionEdicion = entrada.nextInt();
                            entrada.nextLine();
                            switch (opcionEdicion) {
                                case 1:
                                    System.out.println("Nombre actual: " + arNombres[idx]);
                                    System.out.println("Digite el nuevo nombre:");
                                    arNombres[idx] = entrada.nextLine();
                                    break;
                                case 2:
                                    System.out.println("Salario actual: " + arSalarios[idx]);
                                    System.out.println("Digite el nuevo salario:");
                                    arSalarios[idx] = entrada.nextFloat();
                                    entrada.nextLine();
                                    break;
                                case 3:
                                    System.out.println("Sexo actual: " + arSexos[idx]);
                                    System.out.println("Digite el nuevo sexo:");
                                    arSexos[idx] = entrada.nextLine().charAt(0);
                                    break;
                                case 4:
                                    System.out.println("Cargo actual: " + arCargos[idx]);
                                    System.out.println("Digite el nuevo cargo:");
                                    arCargos[idx] = entrada.nextLine();
                                    break;
                                case 5:
                                    System.out.println("Edición cancelada.");
                                    break;
                                default:
                                    System.out.println("Opción invalida");
                            }
                        } else {
                            System.out.println("Registro invalido");
                        }
                    }
                    break;
                case '4':
                    if (cantidad == 0) {
                        System.out.println("No hay registros para borrar");
                    } else {
                        System.out.println("Posicion del registro que va a borrar (1-" + cantidad + ")");
                        int idx = entrada.nextInt() - 1;
                        entrada.nextLine();
                        if (idx >= 0 && idx < cantidad) {
                            for (int i = idx; i < cantidad - 1; i++) {
                                arNombres[i] = arNombres[i + 1];
                                arSalarios[i] = arSalarios[i + 1];
                                arSexos[i] = arSexos[i + 1];
                                arCargos[i] = arCargos[i + 1];
                            }
                            cantidad--;
                            System.out.println("Se borro el registro");
                        }
                    }
                    break;
                case '5':
                    System.out.println("Ha decidido terminar.");
                    activo = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static char menuUsuario() {
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
        System.out.print("Opcion-----------> ");
        String entrada = input.nextLine();
        return entrada.length() > 0 ? entrada.charAt(0) : '0';
    }

    public static void editar() {
        System.out.println("--------------------------------");
        System.out.println("|      EDICION DE USUARIOS      |");
        System.out.println("|                               |");
        System.out.println("| 1. Editar nombre              |");
        System.out.println("| 2. Editar salario             |");
        System.out.println("| 3. Editar sexo                |");
        System.out.println("| 4. Editar cargo               |");
        System.out.println("| 5. Cancelar                   |");
        System.out.println("--------------------------------");
    }
}