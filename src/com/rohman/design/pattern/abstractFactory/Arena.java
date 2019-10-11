package com.rohman.design.pattern.abstractFactory;

public interface Arena {
    public void start();
}

class ArenaEasy implements Arena {

    @Override
    public void start() {
        System.out.println("Easy");

    }
}

class ArenaMedium implements Arena {

    @Override
    public void start() {
        System.out.println("Medium");

    }
}

class ArenaHard implements Arena {

    @Override
    public void start() {
        System.out.println("Hard");

    }
}

