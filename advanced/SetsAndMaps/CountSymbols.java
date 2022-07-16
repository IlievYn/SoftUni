package advanced.SetsAndMaps;

import java.util.*;

public class CountSymbols{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Map<Character, Integer> letterSet = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letterSet.containsKey(letter)){
                letterSet.put(letter,letterSet.get(letter) + 1);
            }else {
                letterSet.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> characterEntry : letterSet.entrySet()) {
            System.out.println(characterEntry.getKey() + ": " + characterEntry.getValue() + " time/s");
        }
    }
}
