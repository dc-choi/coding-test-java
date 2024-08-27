package com.example.javadatastructure.classs.ex;

import java.util.ArrayList;
import java.util.List;

public class ExMain3 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.name = "iPhone 12";
        productOrder1.price = 1200000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.name = "Galaxy S21";
        productOrder2.price = 1100000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.name = "Xperia 1";
        productOrder3.price = 1000000;
        productOrder3.quantity = 3;

        List<ProductOrder> productOrders = new ArrayList<>();
        productOrders.add(productOrder1);
        productOrders.add(productOrder2);
        productOrders.add(productOrder3);

        int totalAmount = 0;
        for (ProductOrder po : productOrders) {
            System.out.println("상품명: " + po.name + ", 가격: " + po.price + "원, 수량: " + po.quantity);
            totalAmount += po.price * po.quantity;
        }
        System.out.println("총 가격: " + totalAmount + "원");
    }
}
