package com.example.javadatastructure.ref.ex;

import java.util.List;

public class ProductOrderMain {
    public static void main(String[] args) {
        List<ProductOrder> productOrderList = List.of(
            ProductOrder.create("초코파이", 1000, 3),
            ProductOrder.create("커피", 500, 2)
        );

        int totalPrice = productOrderList.stream()
                .peek(ProductOrder::print)
                .mapToInt(ProductOrder::getTotalPrice)
                .sum();

        System.out.println("총 결제 금액: " + totalPrice + "원");
    }
}
