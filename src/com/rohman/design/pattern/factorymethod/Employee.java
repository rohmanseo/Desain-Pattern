package com.rohman.design.pattern.factorymethod;

public class Employee {
    private String name,
            title;
    private int salary;

    public Employee(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }
}
