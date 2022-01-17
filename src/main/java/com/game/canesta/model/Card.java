package com.game.canesta.model;

public class Card {

    public enum Color {
        RED, BLACK, NULL
    }

    public enum Category {
        CLUB, HEART, SPADE, DIAMOND, JOKER
    }

    private int num;
    private Color color;
    private Category category;
    private int canestaValue;

    public int getCanestaValue() {
        return canestaValue;
    }

    public void setCanestaValue(int canestaValue) {
        this.canestaValue = canestaValue;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
