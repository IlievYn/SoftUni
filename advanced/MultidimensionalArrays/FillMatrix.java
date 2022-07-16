package advanced.MultidimensionalArrays;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] line = scanner.nextLine().split(", ");
        int n = Integer.parseInt(line[0]);
        int [][] matrix = new int[n][n];
        String pattern = line[1];
        int counter = 1;

        if (pattern.equals("A")){
            fillMatrixPatternA(n, matrix, counter);
        }else {
            fillMatrixPatternB(n, matrix, counter);
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int n, int[][] matrix, int counter) {
        for (int row = 0; row < n; row++) {
            if (row % 2== 0){
                for (int col = 0; col < n; col++) {
                    matrix[col] [row] = counter;
                    counter++;
                }
            }else{
                for (int col = n; col > 0 ; col--) {
                    matrix[col-1] [row] = counter;
                    counter++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int size, int[][] matrix, int counter) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[col] [row] = counter;
                counter++;
            }
        }
    }
}
