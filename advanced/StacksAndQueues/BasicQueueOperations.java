package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] commands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int [] numbers =Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque queue = new ArrayDeque<>();
        for (int number : numbers) {
            queue.offer(number);
        }
        // Delete elements
        for (int i = 0; i < commands[1]; i++) {
            queue.poll();
        }
        //Element check
        if(queue.contains(commands[2])){
            System.out.println("true");
        }else{
            if (queue.isEmpty()){
                System.out.println("0");
            }else{
                System.out.println(Collections.min(queue));
            }
        }
    }
}
