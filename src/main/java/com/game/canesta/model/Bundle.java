package com.game.canesta.model;

import java.util.ArrayList;
import java.util.List;

public class Bundle {

    List<CardPack> cardPacks = new ArrayList<>();

    public List<CardPack> getCardPacks() {
        return cardPacks;
    }

    public Bundle(int totalNoOfCardPacks) {
        for (int i=0;i<totalNoOfCardPacks;i++) {
            cardPacks.add(new CardPack());
        }
    }

}
