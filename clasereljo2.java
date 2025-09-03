public class clasereljo2 {
    public static void main(String args[]) {
        int seg = 0;
        int min = 0;
        int hor = 0;
        for (;;) {
            for (hor = 0; hor < 24; hor++) {
                for (min = 0; min < 60; min++) {
                    for (seg = 0; seg < 60; seg++) {
                        System.out.println(String.format("%02d: %02d: %02d", hor, min, seg));
                    }
                }
            }

        }
    }

}
