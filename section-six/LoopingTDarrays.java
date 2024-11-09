public class LoopingTDarrays {
    public static void main(String[] args) {
        int[][] grades = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 }
        };

        // for (int i = 0; i < grades[0].length; ++i) {
        // System.out.print(grades[0][i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i < grades[1].length; ++i) {
        // System.out.print(grades[1][i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i < grades[2].length; ++i) {
        // System.out.print(grades[2][i] + " ");
        // }
        // System.out.println();

        for (int i = 0; i < grades.length; ++i) {
            switch (i) {
                case 0:
                    System.out.print("\tHarry: ");
                    break;
                case 1:
                    System.out.print("\tRon: ");
                    break;
                case 2:
                    System.out.print("\tHermione: ");
                    break;
                default:
                    System.out.println("Invalid i value");
                    break;
            }
            for (int j = 0; j < grades[i].length; ++j) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
