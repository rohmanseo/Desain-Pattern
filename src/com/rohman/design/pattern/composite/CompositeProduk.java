package com.rohman.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduk extends Produk{
    List<Produk> produks;

    public CompositeProduk(String nama, List<Produk> produks) {
        super(nama);
        this.produks = produks;
    }
}
