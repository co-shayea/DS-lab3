public class Q14 {
    public static void main(String[] args) {
        int[][][] array1 = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        int[][][] array2 = {{{10, 20, 30}, {40, 50, 60}}, {{70, 80, 90}, {100, 110, 120}}};

        int[][][] result = addArraysComponentwise(array1, array2);

        // Print the result array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[i][j].length; k++) {
                    System.out.print(result[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static int[][][] addArraysComponentwise(int[][][] arr1, int[][][] arr2) {
        int[][][] result = new int[arr1.length][arr1[0].length][arr1[0][0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    result[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
                }
            }
        }

        return result;
    }
}
