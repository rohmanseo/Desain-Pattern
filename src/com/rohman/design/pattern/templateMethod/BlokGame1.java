package com.rohman.design.pattern.templateMethod;

public class BlokGame1 extends BlokGameTemplate{
    @Override
    String getEndTitle() {
        return "End Blok Game 1";
    }

    @Override
    String getCharacter() {
        return "O";
    }

    @Override
    Integer getCount() {
        return 10;
    }

    @Override
    String getTitle() {
        return "Start Blok Game 1";
    }
}
