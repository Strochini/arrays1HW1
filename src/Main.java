public class Main {
    public static void main(String[] args) {

        // Task 1 & 2

        int[] arrays0 = new int[]{1, 2, 3};
        double[] arrays1 = new double[]{1.57, 7.654, 9.986};
        int[] arrays2 = new int[]{46, 87, 623, 977, 6483, 5467, 76};


        for (int i = 0; i < arrays0.length; i++) {
            if (arrays0[i] == arrays0[arrays0.length -1]) {
                System.out.print(arrays0[i]);
            } else {
                System.out.print(arrays0[i] + ",");
            }
        }
        System.out.println("\n");

        for (int v = 0; v < arrays1.length; v++) {
            if (arrays1[v] == arrays1[arrays1.length -1]) {
                System.out.print(arrays1[v]);
            } else {
                System.out.print(arrays1[v] + ",");
            }
        }
        System.out.println("\n");

        for (int z = 0; z < arrays2.length; z++) {
            if (arrays2[z] == arrays2[arrays2.length -1]) {

                System.out.print(arrays2[z]);
            }else {
                System.out.print(arrays2[z] + ",");
            }
        }

        // Task 3

        System.out.println("\n");

        for (int a = arrays0.length -1; a >= 0; a--) {
            if (arrays0[a] == arrays0[0]) {
                System.out.print(arrays0[a]);
            } else {
                System.out.print(arrays0[a] + ",");
            }
        }
        System.out.println("\n");

        for (int b = arrays1.length -1; b >= 0; b--) {
            if (arrays1[b] == arrays1[0]) {
                System.out.print(arrays1[b]);
            } else {
                System.out.print(arrays1[b] + ",");
            }
        }
        System.out.println("\n");

        for (int c = arrays2.length -1; c >= 0; c--) {
            if (arrays2[c] == arrays2[0]) {

                System.out.print(arrays2[c]);
            }else {
                System.out.print(arrays2[c] + ",");
            }
        }
        System.out.println("\n");

        // task 4

        for (int d = 0; d < arrays0.length; d++) {
            if (arrays0[d] % 2 != 0) {
                arrays0[d] = arrays0[d] + 1;
                System.out.print(arrays0[d]);

            }


        }
    }
}