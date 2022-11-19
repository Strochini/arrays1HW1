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
        System.out.println("");

        for (int v = 0; v < arrays1.length; v++) {
            if (arrays1[v] == arrays1[arrays1.length -1]) {
                System.out.print(arrays1[v]);
            } else {
                System.out.print(arrays1[v] + ",");
            }
        }
        System.out.println("");

        for (int z = 0; z < arrays2.length; z++) {
            if (arrays2[z] == arrays2[arrays2.length -1]) {

                System.out.print(arrays2[z]);
            }else {
                System.out.print(arrays2[z] + ",");
            }
        }

    }
}