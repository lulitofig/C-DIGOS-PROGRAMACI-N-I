
public class clasesemana4 {
    public static void main(String args[]) {
        int seg = 0;
        int min = 0;
        int hor = 0;
        System.out.println("RELOJ");
        while (true) {
            System.out.println(String.format("%02d: %02d: %02d", hor, min, seg));
            seg = seg + 1;
            if (seg > 59) {
                seg = 0;
                min = min + 1;
                if (min > 59) {
                    min = 0;
                    hor = hor + 1;
                    if (hor > 23) {
                        hor = 0;
                    }
                    ;

                }
            }

            ;

        }

    }

}
