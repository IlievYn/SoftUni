package advanced.SetsAndMaps;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int setLength [] = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new LinkedHashSet<>();
        int counter = 0;

        for (int i = 0; i < setLength[0] + setLength[1]; i++) {
            String number = scanner.nextLine();
            counter++;
            if(counter <=  setLength[0]){
                set1.add(number);
            }else {
                set2.add(number);
            }
        }
        for (String number1 : set1) {
            for (String number2 : set2) {
                if (number1.equals(number2)){
                    set3.add(number1);
                }
            }
        }
        for (String s : set3) {
            System.out.print(s + " ");
        }
    }
}
