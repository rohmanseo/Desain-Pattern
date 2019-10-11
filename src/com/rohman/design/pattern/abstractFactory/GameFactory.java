package com.rohman.design.pattern.abstractFactory;

interface GameFactory {
    public Level level();
    public Arena arena();
    public Enemy enemy();
}

class CreateGameEasy implements GameFactory {

    @Override
    public Level level() {
        return new LevelEasy();
    }

    @Override
    public Arena arena() {
        return new ArenaEasy();
    }

    @Override
    public Enemy enemy() {
        return new EnemyEasy();
    }
}

class CreateGameMedium implements GameFactory {

    @Override
    public Level level() {
        return new LevelMedium();
    }

    @Override
    public Arena arena() {
        return new ArenaMedium();
    }

    @Override
    public Enemy enemy() {
        return new EnemyMedium();
    }
}

class CreateGameHard implements GameFactory {

    @Override
    public Level level() {
        return new LevelHard();
    }

    @Override
    public Arena arena() {
        return new ArenaHard();
    }

    @Override
    public Enemy enemy() {
        return new EnemyHard();
    }
}