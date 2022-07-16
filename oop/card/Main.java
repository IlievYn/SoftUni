package oop.card;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardRank, cardSuits);
        int sumPower = returnSumPower(cardRank, cardSuits);
        System.out.printf("Card name: %s of %s; Card power: %d ", cardRank, cardSuits, sumPower);


    }

    private static int returnSumPower(CardRank cardRank, CardSuits cardSuits) {
        int sumPower = cardSuits.getSuitPower() + cardRank.getCardPower();
        return sumPower;
    }

}
