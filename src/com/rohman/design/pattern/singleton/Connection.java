package com.rohman.design.pattern.singleton;

public class Connection {
    private String host;
    private String username;
    private String password;
    private String database;

    public Connection(String host, String username, String password, String database) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.database = database;
    }
    public void sql(String query){

    }
}
