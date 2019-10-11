package com.rohman.design.pattern.abstractFactory;

public class Main {
    public static void main(String[] args) {

        /*Game gameEasy = new Game(new LevelEasy(), new ArenaEasy());
        Game gameMedium = new Game(new LevelMedium(), new ArenaMedium());
        Game gameHard = new Game(new LevelHard(), new ArenaHard());
        */

        Game gameEasy = new Game(new CreateGameEasy());
        gameEasy.start();
        Game gameMedium = new Game(new CreateGameMedium());
        gameMedium.start();
        Game gameHard= new Game(new CreateGameHard());
        gameHard.start();

    }

}
