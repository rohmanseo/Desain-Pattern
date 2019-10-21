package com.rohman.design.pattern.prototype;

public class Store {
    private String name, city, country, category;

    public Store(String name, String city, String country, String category) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Store clone(){
        return new Store(name,city,country,category);
    }
}
