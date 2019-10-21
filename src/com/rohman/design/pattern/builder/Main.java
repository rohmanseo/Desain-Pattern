package com.rohman.design.pattern.builder;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new MahasiswaBuilder()
                .setNama("Rohman")
                .setNIM(1689)
                .build();

        Dosen dosen = new Dosen.Builder()
                .setNama("Dosen 1")
                .setNIDN(1234)
                .setMataKuliah("Matematika")
                .setTanggalLahir("28 Februari")
                .build();
        Dosen dosen2 = new Dosen.Builder()
                .setNama("Dosen 2")
                .setNIDN(1234)
                .setMataKuliah("Bahasa Indonesia")
                .setTanggalLahir("28 Februari")
                .build();

        System.out.println(mahasiswa);
        System.out.println(dosen);
        System.out.println(dosen2);

    }

}
