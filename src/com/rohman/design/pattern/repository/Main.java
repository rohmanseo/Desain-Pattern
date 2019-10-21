package com.rohman.design.pattern.repository;

public class Main {
    public static void main(String[] args) {
        /*Contoh penggunaan repository pattern adalah pada saat membuah sebuah aplikasi yang mempunnyai
        operasi ke database, maka semua methodnya dibuatkan sebuah kelas baru*/

        Repository repository = new Repository();

        repository.create("blah");
        repository.read("blah");
        repository.update("blah");
        repository.delete("blah");
    }
}
