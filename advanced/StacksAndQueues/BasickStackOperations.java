package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasickStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr1 = scanner.nextLine().split("\\s+");
        String [] arr2 = scanner.nextLine().split("\\s+");
        int [] arrayNumbers1 = Arrays.stream(arr1).mapToInt(Integer::parseInt).toArray();
        int [] arrayNumbers2 = Arrays.stream(arr2).mapToInt(Integer::parseInt).toArray();

        int numbersQuontity = arrayNumbers1[0];
        int pops = arrayNumbers1[1];
        int number = arrayNumbers1[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbersQuontity; i++) {
            stack.push(arrayNumbers2[i]);
        }

        for (int i = 0; i < pops; i++) {
            stack.pop();
        }
        if (stack.contains(number)){
            System.out.println("true");
        }else{
            if (stack.isEmpty()){
                System.out.println("0");
            }else{
                int temp = stack.peek();
                while (!stack.isEmpty()){
                    temp = Math.min(temp, stack.pop());
                }
                System.out.println(temp);
            }
        }

    }
}
