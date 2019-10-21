package com.rohman.design.pattern.prototype;

public class Main {
    public static void main(String[] args) {
/*
        Store store1 = new Store("Toko X","Jakarta","Indonesia","Gadget");
        Store store2 = new Store("Toko Y","Jakarta","Indonesia","Gadget");
        Store store3 = new Store("Toko Z","Bandung","Indonesia","Gadget");
        Store store4 = new Store("Toko W","Bandung","Indonesia","Fashion");
*/
        Store store1 = new Store("Toko X","Jakarta","Indonesia","Gadget");

        Store store2 = store1.clone();
        store2.setName("Toko Y");

        Store store3 = store1.clone();
        store3.setName("Toko Z");
        store3.setCity("Bandung");

        Store store4 = store3.clone();
        store4.setName("Toko W");
        store4.setCategory("Fasion");

    }
}
