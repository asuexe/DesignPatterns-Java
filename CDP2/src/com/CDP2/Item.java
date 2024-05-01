package com.CDP2;
public class Item implements Component {
    private String name;
    private int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void showPrice() {
        System.out.println(name + " : $" + price);
    }
}