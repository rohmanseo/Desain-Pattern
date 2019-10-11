package com.rohman.design.pattern.factorymethod;

public class AnimalFactory {

    public static Animal create(String type) {

        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "tiger":
                return new Tiger();
            default:
                return null;
        }
    }

}
