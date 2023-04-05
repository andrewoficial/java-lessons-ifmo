package ru.itmo.lessons.lesson10;

public class Article {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    private String name;
    private Country country;

    public Article(String name){

    }
}
