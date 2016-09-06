package com.example.lesson34;

public enum Apple {
    JONATHAN(10), GOLDEN(9), WINESAP(15), CORTLAND(8);
    private int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
