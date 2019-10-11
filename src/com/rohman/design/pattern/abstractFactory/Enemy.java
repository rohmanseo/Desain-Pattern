package com.rohman.design.pattern.abstractFactory;

public interface Enemy {
    public void start();
}

class EnemyEasy implements Enemy {

    @Override
    public void start() {
        System.out.println("Easy");
    }
}

class EnemyMedium implements Enemy {

    @Override
    public void start() {
        System.out.println("Medium");
    }
}

class EnemyHard implements Enemy {

    @Override
    public void start() {
        System.out.println("Hard");
    }
}
