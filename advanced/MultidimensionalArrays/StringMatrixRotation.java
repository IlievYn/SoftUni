package advanced.MultidimensionalArrays;

import java.util.*;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] rotationValue = scanner.nextLine().split("\\D+");
        int rotation =  Integer.parseInt(rotationValue[1]);
        String rowInput = scanner.nextLine();
        List<String> arrayMatrix = new ArrayList<>();
        int i = 0;
        int longestWord = Integer.MIN_VALUE;

        while (!rowInput.equals("END")){
            if (rowInput.length() > longestWord){
                longestWord = rowInput.length();
            }
            arrayMatrix.add(rowInput);
            i++;
            rowInput = scanner.nextLine();
        }
        int row = arrayMatrix.size();
        int col = longestWord;
       char [][] matrix = new char[col] [];
        for (int j = 0; j < arrayMatrix.size(); j++) {
            char [] symbols = arrayMatrix.get(j).toCharArray();
            for (int k = 0; k < col; k++) {
                for (int l = 0; l <symbols.length ; l++) {
                    matrix[k][l] = symbols[l];
                }
            }
        }
            System.out.println();
        }
    }
