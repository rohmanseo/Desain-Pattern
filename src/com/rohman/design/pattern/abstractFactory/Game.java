package com.rohman.design.pattern.abstractFactory;

public class Game {

    /**
     * @var level
     */
    private Level level;

    /**
     * @var arena
     */
    private Arena arena;

    private Enemy enemy;

    public Game(GameFactory gameFactory){
        this.level = gameFactory.level();
        this.arena = gameFactory.arena();
        this.enemy = gameFactory.enemy();
    }

    public void start(){
        arena.start();
        level.start();
        enemy.start();
    }

}
