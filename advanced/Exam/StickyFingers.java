package advanced.Exam;

import java.util.Scanner;

public class StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String [] commandsInput = scanner.nextLine().split(",");
        String [][] matrix = new String[size][size];
        int earnTotal = 0;
        Boolean dillingerInJail = false;
          //Fill the  Matrix
        matrix = fillMatrix(scanner,size);
        //Find Dillinger
        int []dillingerPosition = findDillingerPosition(matrix,size);

        for (int i = 0; i < commandsInput.length; i++) {
            String move = commandsInput[i];
            if (dillingerInJail) {
                break;
            }else {
                switch (move){
                    case "left":
                        if (dillingerPosition[1] - 1 < 0){
                            System.out.println("You cannot leave the town, there is police outside!");
                        }else{
                            matrix[dillingerPosition[0]][dillingerPosition[1]] = "+";
                            dillingerPosition[1] = dillingerPosition[1] - 1;
                        }
                        break;

                    case "right":
                        if (dillingerPosition[1] + 1 > size){
                            System.out.println("You cannot leave the town, there is police outside!");
                        }else{
                            matrix[dillingerPosition[0]][dillingerPosition[1]] = "+";
                            dillingerPosition[1] = dillingerPosition[1] + 1;
                        }
                        break;
                    case "up":
                        if (dillingerPosition[0] - 1 < 0){
                            System.out.println("You cannot leave the town, there is police outside!");
                        }else{
                            matrix[dillingerPosition[0]][dillingerPosition[1]] = "+";
                            dillingerPosition[0] = dillingerPosition[0] - 1;
                        }
                        break;
                    case "down":
                        if (dillingerPosition[0] + 1 > size -1){
                            System.out.println("You cannot leave the town, there is police outside!");
                        }else{
                            matrix[dillingerPosition[0]][dillingerPosition[1]] = "+";
                            dillingerPosition[0] = dillingerPosition[0] + 1;
                        }
                        break;
                }
                earnTotal = checkDillingerEarn(matrix,size,dillingerPosition,earnTotal);
                dillingerInJail = checkDillingerInTheJail(matrix,size,dillingerPosition,earnTotal,dillingerInJail);
                matrix[dillingerPosition[0]][dillingerPosition[1]] = "D";
            }

        }
        if (dillingerInJail){
            System.out.println("You got caught with " + earnTotal + "$, and you are going to jail.");
        }else {
            System.out.println("Your last theft has finished successfully with " + earnTotal + "$ in your pocket.");
        }
        printMatrix(matrix,size);

    }
    private static String[][] fillMatrix(Scanner scanner, int size){
        String [][] matrix = new String[size][size];
        for (int row = 0; row < size; row++) {
            String [] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < rowInput.length; col++) {
                matrix[row][col] = rowInput[col];
            }
        }
        return matrix;
    }

 private static int [] findDillingerPosition(String [][]matrix, int size){
     int [] position = {0,0};
     for (int row = 0; row < size; row++) {
         for (int col = 0; col < size; col++) {
             if (matrix[row][col].equals("D")){
                 position [0] = row;
                 position [1] = col;
             }
         }
     }
        return  position;
 }
private static int checkDillingerEarn(String [][]matrix, int size,int [] dillingerPosition, int earnTotal){

    if (matrix[dillingerPosition[0]][dillingerPosition[1]].equals("$")){
        int earn = dillingerPosition[0]*dillingerPosition[1];
        earnTotal +=earn;
        matrix[dillingerPosition[0]][dillingerPosition[1]] = "D";
        System.out.println("You successfully stole " + earn +"$.");
    }
    return earnTotal;
 }
 private static boolean checkDillingerInTheJail(String [][]matrix, int size,int [] dillingerPosition, int earn, boolean dillingerInJail){
     if (matrix[dillingerPosition[0]][dillingerPosition[1]].equals("P")){
         matrix[dillingerPosition[0]][dillingerPosition[1]] = "#";
         dillingerInJail = true;
     }
        return dillingerInJail;
 }
 private static void printMatrix (String matrix[][], int size){
     for (int raw = 0; raw < size; raw++) {
         for (int col = 0; col < size; col++) {
             System.out.print(matrix[raw][col]+ " ");
         }
         System.out.println();
     }
 }
}
