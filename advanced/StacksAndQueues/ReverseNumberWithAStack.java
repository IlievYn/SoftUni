package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] number = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stackArray = new ArrayDeque<>();
        for (String s : number) {
            stackArray.push(s);
        }
        while (!stackArray.isEmpty()){
            System.out.print(stackArray.pop() + " ");
        }
    }
}

