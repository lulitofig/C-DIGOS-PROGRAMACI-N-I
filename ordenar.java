public class ordenar {
    public static void ordenarAlfabeticamente(String[] personas, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (personas[i].compareToIgnoreCase(personas[j]) > 0) {
                    String temp = personas[i];
                    personas[i] = personas[j];
                    personas[j] = temp;
                }
            }
        }
    }
}
