package advanced.StacksAndQueues;

import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());

        ArrayDeque stack = new ArrayDeque<>();
        int higherElement =  Integer.MIN_VALUE;
        for (int i = 0; i < iterations; i++) {
            String [] commandsLine = scanner.nextLine().split("\\s+");
            String command = commandsLine[0];
            switch (command){
                case "1":
                    int element = Integer.parseInt(commandsLine[1]);
                    stack.push(element);
                   break;
                case "2":
                        stack.pop();
                        break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
                    }
            }
        }
    }
