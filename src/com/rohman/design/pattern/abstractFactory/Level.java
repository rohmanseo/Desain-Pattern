package com.rohman.design.pattern.abstractFactory;

interface Level{
    public void start();
}

class LevelEasy implements Level{

    @Override
    public void start() {
        System.out.println("Easy");
    }
}

class LevelMedium implements Level{

    @Override
    public void start() {
        System.out.println("Medium");

    }
}

class LevelHard implements Level{

    @Override
    public void start() {
        System.out.println("Hard");

    }
}