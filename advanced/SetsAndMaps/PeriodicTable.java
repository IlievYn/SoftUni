package advanced.SetsAndMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());

        Set<String> setOfElement = new TreeSet<>();
        for (int i = 0; i < iterations; i++) {
            String[] elements = scanner.nextLine().split(" ");
            for (int j = 0; j < elements.length; j++) {
                setOfElement.add(elements[j]);
            }
        }
        for (String s : setOfElement) {
            System.out.print(s + " ");
        }
    }
}
