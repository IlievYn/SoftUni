package oop.card;

public class Card {
    private CardRank cardRank;
    private CardSuits cardSuits;

    public Card(CardRank cardRank, CardSuits cardSuits) {
        this.cardRank = cardRank;
        this.cardSuits = cardSuits;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(CardSuits cardSuits) {
        this.cardSuits = cardSuits;
    }
}
