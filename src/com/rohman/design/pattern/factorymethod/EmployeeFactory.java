package com.rohman.design.pattern.factorymethod;

public class EmployeeFactory {
    public static Employee createManager(String name){
        Employee manager = new Employee(name,"Manager",10000000);
        return manager;
    }
    public static Employee createStaff(String name){
        Employee staff = new Employee(name,"Staff",5000000);
        return staff;
    }

}
