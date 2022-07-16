package advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] line = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String [][] matrix = new String[line[0]][line[1]];
        char [] counter = {'a','a','a'};
        StringBuilder concatSymbols = new StringBuilder();
        for (int col = 0; col < line[0]; col++) {
            char secondCounter = counter[1];
            for (int row = 0; row < line[1]; row++) {
                concatSymbols.append(counter[0]).append(secondCounter).append(counter[2]);
                System.out.print(matrix[col][row] = concatSymbols.toString() + " ");
                secondCounter++;
                concatSymbols = new StringBuilder();

            }
            counter[0]++;
            counter[1]++;
            counter[2]++;
            System.out.println();
        }
    }
}
