package advanced.SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());
        Set<String> wordSet = new LinkedHashSet<>();
        for (int i = 0; i < iterations; i++) {
            String words = scanner.nextLine();
            wordSet.add(words);
        }
        for (String s : wordSet) {
            System.out.println(s);
        }
    }
}
