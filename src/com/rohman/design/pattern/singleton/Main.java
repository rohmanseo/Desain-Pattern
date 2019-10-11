package com.rohman.design.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("901");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("121","Kue");
    }
}
