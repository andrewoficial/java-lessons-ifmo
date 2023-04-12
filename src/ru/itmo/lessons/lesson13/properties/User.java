package ru.itmo.lessons.lesson13.properties;

public class User <T>{
    private T id;

    private String login;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
