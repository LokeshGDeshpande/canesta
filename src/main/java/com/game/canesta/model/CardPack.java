package com.game.canesta.model;

public class CardPack {

    private Card[] cards = new Card[55];

    public Card[] getCards() {
        return cards;
    }

    public CardPack() {
        int counter = 0;
        for (int i=0;i<4;i++) {
            for (int j=0;j<13;j++) {
                int num = j + 1;
                Card card = new Card();
                card.setNum(num);
                if (i == 0) {
                    card.setCategory(Card.Category.CLUB);
                } else if (i == 1) {
                    card.setCategory(Card.Category.HEART);
                } else if (i == 2) {
                    card.setCategory(Card.Category.SPADE);
                } else if (i == 3) {
                    card.setCategory(Card.Category.DIAMOND);
                }
                if (card.getCategory() == Card.Category.HEART || card.getCategory() == Card.Category.DIAMOND) {
                    card.setColor(Card.Color.RED);
                } else {
                    card.setColor(Card.Color.BLACK);
                }

                card.setCanestaValue(num >= 4 && num <= 9 ? 5 : num >= 10 ? 10 : num == 1 || num == 2 ? 20 : 0);
                if (num == 3) {
                    if (card.getColor() == Card.Color.RED) {
                        card.setCanestaValue(100);
                    } else {
                        card.setCanestaValue(0);
                    }
                }

                cards[counter++] = card;
            }
        }

        for (int i=0;i<3;i++) {
            Card card = new Card();
            card.setNum(50);
            card.setCanestaValue(50);
            card.setColor(Card.Color.NULL);
            card.setCategory(Card.Category.JOKER);

            cards[counter++] = card;
        }
    }
}
