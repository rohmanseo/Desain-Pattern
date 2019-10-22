package com.rohman.design.pattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produk> list = Arrays.asList(
                new CompositeProduk("Kendaraan", Arrays.asList(
                        new Produk("Mobil"),
                        new Produk("Motor")
                )),
                new Produk("Elektronik"),
                new Produk("Fashion")
        );

        list.forEach(it->{

        });

    }
}
