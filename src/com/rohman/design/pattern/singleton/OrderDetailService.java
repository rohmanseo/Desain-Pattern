package com.rohman.design.pattern.singleton;

public class OrderDetailService {
    public void save(String orderId, String product){
        Connection connection = DatabaseHelper.getConnection();
        connection.sql("Select * from ...");
    }
}
