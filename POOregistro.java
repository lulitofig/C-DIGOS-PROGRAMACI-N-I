import java.util.Scanner;

public class POOregistro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el número de registros que desea hacer:");
        int n = entrada.nextInt();
        entrada.nextLine();
        nombre[] registros = new nombre[n];
        int cantidad = 0;
        boolean activo = true;
        while (activo) {
            char opcion = menuUsuario(entrada);
            switch (opcion) {
                case '1':
                    if (cantidad < n) {
                        System.out.println("--- CREAR REGISTRO ---");
                        System.out.println("Digite su nombre:");
                        String nombre = entrada.nextLine();
                        System.out.println("Digite su salario:");
                        float salario = entrada.nextFloat();
                        entrada.nextLine();
                        System.out.println("Digite M si es masculino y F si es femenino:");
                        char sexo = entrada.nextLine().charAt(0);
                        System.out.println("Digite su cargo:");
                        String cargo = entrada.nextLine();
                        registros[cantidad] = new nombre(nombre, salario, sexo, cargo);
                        cantidad++;
                        System.out.println("Registro creado con éxito.");
                    } else {
                        System.out.println("No hay espacio para más registros.");
                    }
                    break;
                case '2':
                    if (cantidad == 0) {
                        System.out.println("No ha digitado ningún registro.");
                    } else {
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println("Registro #" + (i + 1));
                            System.out.println("  Nombre: " + registros[i].getNombre());
                            System.out.println("  Salario: " + registros[i].getSalario());
                            System.out.println("  Sexo: " + registros[i].getSexo());
                            System.out.println("  Cargo: " + registros[i].getCargo());
                        }
                    }
                    break;
                case '3':
                    if (cantidad == 0) {
                        System.out.println("No hay registros para editar.");
                    } else {
                        System.out.println("Posicion que va a editar:(1-" + cantidad + ")");
                        int idx = entrada.nextInt() - 1;
                        entrada.nextLine();
                        if (idx >= 0 && idx < cantidad) {
                            editarRegistro(entrada, idx, registros);
                        } else {
                            System.out.println("Registro inválido.");
                        }
                    }
                    break;
                case '4':
                    if (cantidad == 0) {
                        System.out.println("No hay registros para borrar");
                    } else {
                        System.out.println("Posición del registro que va a borrar (1-" + cantidad + ")");
                        int idx = entrada.nextInt() - 1;
                        entrada.nextLine();
                        if (idx >= 0 && idx < cantidad) {
                            for (int i = idx; i < cantidad - 1; i++) {
                                registros[i] = registros[i + 1];
                            }
                            registros[cantidad - 1] = null;
                            cantidad--;
                            System.out.println("Registro borrado con exito");
                        } else {
                            System.out.println("Registro invalido");
                        }
                    }
                    break;
                case '5':
                    System.out.println("Ha decidido terminar");
                    activo = false;
                    break;
                case '6':
                    if (cantidad == 0) {
                        System.out.println("No hay registros para ordenarse");
                    } else {
                        ordenarRegistros(registros, cantidad);
                    }
                    break;
                default:
                    System.out.println("La opcion no es valida, escriba otra vez");
                    break;
            }
        }
    }

    public static char menuUsuario(Scanner entrada) {
        System.out.println("---------------------------------------");
        System.out.println("|         REGISTRO DE USUARIOS        |");
        System.out.println("|                                     |");
        System.out.println("| 1. Crear                            |");
        System.out.println("| 2. Leer                             |");
        System.out.println("| 3. Editar                           |");
        System.out.println("| 4. Borrar                           |");
        System.out.println("| 5. Terminar                         |");
        System.out.println("| 6. Ordenar alfabeticamente          |");
        System.out.println("---------------------------------------");
        System.out.print("Seleccione una opción: ");
        String opcionString = entrada.nextLine();
        return opcionString.length() > 0 ? opcionString.charAt(0) : ' ';
    }

    public static void editarRegistro(Scanner entrada, int idx, nombre[] registros) {
        System.out.println("--------------------------------");
        System.out.println("|      EDICION DE USUARIOS      |");
        System.out.println("|                               |");
        System.out.println("| 1. Editar nombre              |");
        System.out.println("| 2. Editar salario             |");
        System.out.println("| 3. Editar sexo                |");
        System.out.println("| 4. Editar cargo               |");
        System.out.println("| 5. Cancelar                   |");
        System.out.println("---------------------------------");
        System.out.print("Seleccione una opción de edición: ");
        int opcionEdicion = entrada.nextInt();
        entrada.nextLine();

        switch (opcionEdicion) {
            case 1:
                System.out.println("Nombre actual: " + registros[idx].getNombre());
                System.out.println("Digite el nuevo nombre:");
                registros[idx].setNombre(entrada.nextLine());
                System.out.println("Ya se ha actualizado.");
                break;
            case 2:
                System.out.println("Salario actual: " + registros[idx].getSalario());
                System.out.println("Digite el nuevo salario:");
                registros[idx].setSalario(entrada.nextFloat());
                entrada.nextLine();
                System.out.println("Salario actualizado.");
                break;
            case 3:
                System.out.println("Sexo actual: " + registros[idx].getSexo());
                System.out.println("Digite el nuevo sexo:");
                registros[idx].setSexo(entrada.nextLine().charAt(0));
                System.out.println("Sexo actualizado.");
                break;
            case 4:
                System.out.println("Cargo actual: " + registros[idx].getCargo());
                System.out.println("Digite el nuevo cargo:");
                registros[idx].setCargo(entrada.nextLine());
                System.out.println("Cargo actualizado.");
                break;
            case 5:
                System.out.println("Edición cancelada.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void ordenarRegistros(nombre[] registros, int cantidad) {
        if (cantidad <= 1) {
            return;
        }
        ordenarPorDivision(registros, cantidad);
    }

    public static void ordenarPorDivision(nombre[] registros, int cantidad) {
        if (cantidad <= 1) {
            return;
        }
        int mid = cantidad / 2;
        nombre[] subRegistros1 = new nombre[mid];
        nombre[] subRegistros2 = new nombre[cantidad - mid];

        System.arraycopy(registros, 0, subRegistros1, 0, mid);
        System.arraycopy(registros, mid, subRegistros2, 0, cantidad - mid);

        ordenarPorDivision(subRegistros1, mid);
        ordenarPorDivision(subRegistros2, cantidad - mid);

        combinarArreglos(subRegistros1, subRegistros2, registros);
    }

    public static void combinarArreglos(nombre[] subRegistros1, nombre[] subRegistros2, nombre[] registros) {
        int i = 0, j = 0, k = 0;
        while (i < subRegistros1.length && j < subRegistros2.length) {
            if (esMenorOIgual(subRegistros1[i].getNombre(), subRegistros2[j].getNombre())) {
                registros[k++] = subRegistros1[i++];
            } else {
                registros[k++] = subRegistros2[j++];
            }
        }
        while (i < subRegistros1.length) {
            registros[k++] = subRegistros1[i++];
        }
        while (j < subRegistros2.length) {
            registros[k++] = subRegistros2[j++];
        }
    }

    public static boolean esMenorOIgual(String palabra1, String palabra2) {
        return palabra1.compareToIgnoreCase(palabra2) <= 0;
    }
}
