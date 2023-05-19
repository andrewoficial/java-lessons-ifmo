package ru.itmo.lessons.lesson23;

public class Resource implements AutoCloseable{
    @Override
    public void close() /* throws Exception */ {
        System.out.println("Закрытие ресурсов");
    }
}