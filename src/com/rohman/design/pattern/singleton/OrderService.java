package com.rohman.design.pattern.singleton;

public class OrderService {
    public void save(String orderId){
        Connection connection = DatabaseHelper.getConnection();
        connection.sql("Select * from `users`");
    }

}
