package advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int [] rowInput = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = rowInput;
        }
        int sum1 = primaryDiagonal(n, matrix);
        int sum2 = secondDiagonal(n, matrix);
        int finalSum = Math.abs(sum1 - sum2);
        System.out.println(finalSum);
    }

    private static int secondDiagonal(int n, int[][] matrix) {
        int sum2 = 0;
        for (int row = 0 , col = n -1; row <  n ; row++, col--) {
            sum2 += matrix[row][col];
        }
        return sum2;
    }
    private static int primaryDiagonal(int n, int[][] matrix) {
        int sum1 = 0;
        for (int row = 0, col = 0; row < n; row++, col++) {
            sum1 += matrix[row][col];
        }
        return sum1;
    }
}
