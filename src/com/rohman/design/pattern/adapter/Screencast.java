package com.rohman.design.pattern.adapter;

public class Screencast {
    private String judul;
    private String pembuat;
    private long durasi;

    public Screencast(String judul, String pembuat, long durasi) {
        this.judul = judul;
        this.pembuat = pembuat;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public String getPembuat() {
        return pembuat;
    }

    public long getDurasi() {
        return durasi;
    }
}
