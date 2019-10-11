package com.rohman.design.pattern.singleton;

public class DatabaseHelper {
    private static Connection connection = null;

    public static Connection getConnection(){
        if(connection == null){
            connection = new Connection("localhost","root","","SingletonApp");
        }
        return connection;
    }
}
