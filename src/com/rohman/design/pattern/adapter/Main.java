package com.rohman.design.pattern.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<KatalogAdapter> list = new ArrayList<>();

        list.add(new BookKatalogAdapter(new Book("Pemrograman Java","Eko")));
        list.add(new BookKatalogAdapter(new Book("Pemrograman PHP","Kurniawan")));
        list.add(new BookKatalogAdapter(new Book("Pemrograman Python","Bagas")));

        list.add(new ScreencastKatalogAdapter(new Screencast("Web Laravel","Joko",100L)));
        list.add(new ScreencastKatalogAdapter(new Screencast("Web Rails","Rudi",200L)));
        list.add(new ScreencastKatalogAdapter(new Screencast("Mobile App","Ardi",130L)));

/*
    Tidak efektif dengan cara seperti ini
        list.forEach(item ->{
            if (item instanceof Book){
                Book book = (Book) item;
                System.out.println(book.getJudul() + " By " +book.getPenulis());
            }else if (item instanceof Screencast){
                Screencast screencast = (Screencast) item;
                System.out.println(screencast.getJudul() + " By " +screencast.getPembuat());
            }
        });
*/

    //Lebih efektif kita membuat interface untuk setiap Class
        list.forEach(it->{
            System.out.println(it.getJudul());
        });

    }
}
