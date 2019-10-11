package com.rohman.design.pattern.builder;

public class Mahasiswa {

    private String nama;
    private int NIM;
    private String prodi;
    private String alamat;

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", NIM=" + NIM +
                ", prodi='" + prodi + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}