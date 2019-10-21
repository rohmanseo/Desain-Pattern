package com.rohman.design.pattern.templateMethod;

public abstract class BlokGameTemplate {

    final void start(){
        System.out.println(getTitle());
        for (int i=0;i<getCount();i++){
            for (int j=0;j<getCount();j++){
                System.out.print(getCharacter());
            }
            System.out.print("\n");
        }
        System.out.println(getEndTitle());
    }

    abstract String getEndTitle();

    abstract String getCharacter();

    abstract Integer getCount();

    abstract String getTitle();


}
