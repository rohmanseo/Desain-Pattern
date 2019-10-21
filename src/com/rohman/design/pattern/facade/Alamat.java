package com.rohman.design.pattern.facade;

public class Alamat {
    int id;
    String jalan;
    String negara;

    public Alamat(int id, String jalan, String negara) {
        this.id = id;
        this.jalan = jalan;
        this.negara = negara;
    }

    public int getId() {
        return id;
    }

    public String getJalan() {
        return jalan;
    }

    public String getNegara() {
        return negara;
    }
}
