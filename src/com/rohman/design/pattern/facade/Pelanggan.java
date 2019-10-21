package com.rohman.design.pattern.facade;

import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    int id;
    String nama;
    List<Alamat> list;

    public Pelanggan(int id, String nama) {
        this.id = id;
        this.nama = nama;
        this.list = list;
    }

    public void setList(List<Alamat> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public List<Alamat> getList() {
        return list;
    }
}
