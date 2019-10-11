package com.rohman.design.pattern.builder;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new MahasiswaBuilder()
                .setNama("Rohman")
                .setNIM(1689)
                .build();

        System.out.println(mahasiswa);
    }

}
