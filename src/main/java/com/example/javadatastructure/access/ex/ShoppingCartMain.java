package com.example.javadatastructure.access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("컵라면", 800, 3);
        Item item2 = new Item("김치", 800, 1);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
