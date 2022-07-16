package advanced.Exam;

import java.util.*;

public class ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] milkValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        double[] cacaokValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Deque<Double> milkQueue = new ArrayDeque<>();
        Deque<Double> cacaoStack = new ArrayDeque<>();
        Map<String, Integer> chocolates = new TreeMap<>();

        for (double v : milkValue) {
            milkQueue.offer(v);
        }
        for (double v : cacaokValue) {
            cacaoStack.push(v);
        }
        for (int i = 0; i < milkQueue.size() || 0 < cacaoStack.size(); i++) {
            double valuesSum = milkQueue.peek() + cacaoStack.peek();
            double cacoaPercentage = (cacaoStack.peek() / valuesSum) * 100;
            if (cacoaPercentage == 30) {
                chocolates.putIfAbsent("Milk Chocolate", 0);
                chocolates.put("Milk Chocolate", chocolates.get("Milk Chocolate") + 1);
            } else if (cacoaPercentage == 50) {
                chocolates.putIfAbsent("Dark Chocolate", 0);
                chocolates.put("Dark Chocolate", chocolates.get("Dark Chocolate") + 1);
            } else if (cacoaPercentage == 100) {
                chocolates.putIfAbsent("Baking Chocolate", 0);
                chocolates.put("Baking Chocolate", chocolates.get("Baking Chocolate") + 1);
            } else {
                milkQueue.offer(milkQueue.peek() + 10);
            }
            milkQueue.poll();
            cacaoStack.pop();
        }
        if (chocolates.keySet().size() == 3) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        for (Map.Entry<String, Integer> values : chocolates.entrySet()) {
            System.out.println("# " + values.getKey() + " --> " + values.getValue());
        }
    }
}
