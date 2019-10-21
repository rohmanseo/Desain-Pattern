package com.rohman.design.pattern.adapter;

public class ScreencastKatalogAdapter implements KatalogAdapter {

    private Screencast screencast;

    public ScreencastKatalogAdapter(Screencast screencast) {
        this.screencast = screencast;
    }

    @Override
    public String getJudul() {
        return screencast.getJudul() +" By "+ screencast.getPembuat() + " Durasi " + screencast.getDurasi();
    }
}
