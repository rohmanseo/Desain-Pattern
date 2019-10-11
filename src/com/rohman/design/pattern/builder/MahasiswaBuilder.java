package com.rohman.design.pattern.builder;

public class MahasiswaBuilder{

    private String nama;
    private int NIM = 0;
    private String prodi = "";
    private String alamat = "";

    public MahasiswaBuilder setAlamat(String alamat) {
        this.alamat = alamat;
        return this;
    }

    public MahasiswaBuilder setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public MahasiswaBuilder setNIM(int NIM) {
        this.NIM = NIM;
        return this;
    }

    public MahasiswaBuilder setProdi(String prodi) {
        this.prodi = prodi;
        return this;
    }

    public Mahasiswa build(){
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama(this.nama);
        mahasiswa.setNIM(this.NIM);
        mahasiswa.setProdi(this.prodi);
        mahasiswa.setAlamat(this.alamat);
        return mahasiswa;
    }
}