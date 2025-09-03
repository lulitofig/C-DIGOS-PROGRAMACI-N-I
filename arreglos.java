public class arreglos {
    public static void main(String args[]) {
        int numeros[] = new int[10]; // creacion de variable
        for (int i = 9; i >= 0; i--) {
            numeros[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

    }

}
