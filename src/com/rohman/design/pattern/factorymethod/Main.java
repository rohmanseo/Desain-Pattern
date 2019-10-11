package com.rohman.design.pattern.factorymethod;

public class Main {
    public static void main(String[] args) {


/*        Employee manager1 = new Employee("Joko","Manager",1000000);
        Employee manager2 = new Employee("Rudi","Manager",1000000);

        Employee staff1 = new Employee("Anton","Staff",500000);
        Employee staff2 = new Employee("Rio","Staff",500000);*/

        Employee manager1 = EmployeeFactory.createManager("Joko");
        Employee manager2 = EmployeeFactory.createManager("Rudi");

        Employee staff1 = EmployeeFactory.createStaff("Anton");
        Employee staff2 =  EmployeeFactory.createStaff("Rio");

        System.out.println(staff1);

//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Tiger tiger = new Tiger();

        Animal dog = AnimalFactory.create("dog");
        dog.speak();
        Animal cat = AnimalFactory.create("cat");
        cat.speak();
        Animal tiger = AnimalFactory.create("tiger");
        tiger.speak();

    }
}
