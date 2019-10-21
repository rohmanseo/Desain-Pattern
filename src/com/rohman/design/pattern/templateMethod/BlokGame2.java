package com.rohman.design.pattern.templateMethod;

public class BlokGame2 extends BlokGameTemplate{
    @Override
    String getEndTitle() {
        return "End Blok Game 2";
    }

    @Override
    String getCharacter() {
        return "A";
    }

    @Override
    Integer getCount() {
        return 20;
    }

    @Override
    String getTitle() {
        return "Start Blok Game 2";
    }
}
