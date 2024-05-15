package com.example.javadatastructure.ref.ex;

public class ProductOrder {
    String name;
    int price;
    int quantity;

    public static ProductOrder create(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();

        productOrder.name = name;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    public void print() {
        System.out.println("상품명: " + this.name + ", 가격: " + this.price + ", 수량: " + this.quantity);
    }

    public int getTotalPrice() {
        return this.price * this.quantity;
    }
}
