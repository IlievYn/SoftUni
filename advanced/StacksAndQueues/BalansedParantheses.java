package advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalansedParantheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  parentheses = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();
        Boolean yes = true;

        if (parentheses.length() %2 != 0){
           yes = false;
        }else {
            int i = 0;
            for ( ; i < parentheses.length()/2; i++) {
                char brackets = parentheses.charAt(i);
                stack.push(brackets);
            }
            for (; i < parentheses.length(); i++) {
                char brackets = parentheses.charAt(i);
                queue.offer(brackets);
            }
            for (Character char1 : stack) {
                char bracket1 = stack.pop();
                switch (bracket1){
                    case '(':
                        if (!queue.poll().equals(')')){
                            yes = false;
                        }
                        break;
                    case '[':
                        if (!queue.poll().equals(']')){
                            yes = false;
                        }
                        break;
                    case '{':
                        if (!queue.poll().equals('}')) {
                            yes = false;
                        }
                        break;
                }
            }
        }
        if (yes){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
