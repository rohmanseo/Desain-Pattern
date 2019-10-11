package com.rohman.design.pattern.factorymethod;

interface Animal {
    void speak();
}

class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("Cat");
    }
}

class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Dog");
    }
}

class Tiger implements Animal {

    @Override
    public void speak() {
        System.out.println("Tiger");
    }
}