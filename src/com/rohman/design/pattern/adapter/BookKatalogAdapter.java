package com.rohman.design.pattern.adapter;

public class BookKatalogAdapter implements KatalogAdapter {

    private Book book;

    public BookKatalogAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getJudul() {
        return book.getJudul() +" By "+ book.getPenulis();
    }

}
