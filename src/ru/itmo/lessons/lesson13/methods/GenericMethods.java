package ru.itmo.lessons.lesson13.methods;

public class GenericMethods {
    /*
    Типизированные методы.
    Могут принимать на вход и возвращать Generic-типы.
    Generic-типы существуют только на этапе компиляции,
    их нет во время выполнения.
    <T> указывает на то что в методе используется Generic-тип (T)
    без <T> нельзя использовать Generic-тип в параметрах или типе возвращаемого значения
    */

    public static <T> boolean inArray (T[] array, T element){
        // Стирание типов (type erasuce):
        // Genetic-тип без ограничений (unboundet) компилируется в тип данных Object.
        // Genetic-тип с ограничениями (boundet) компилируется в тип данных ограничения.
        for (T t : array) {
            if(element.equals(t)) return true;
        }
        return false;
    }

    public static <T extends Number, K extends String> int compareHashCode(T first, K second){
        //T compile to number
        //T compile to String

        //У Genetic-типа с ограничениями модно вызывать методы типа-ограничения и его родителей.

        // У объекта типа T можно вызвать методы Number и его родителей
        // У объекта типа K можно вызвать методы String и его родителей
        return Integer.compare(first.hashCode(), second.hashCode());
    }
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue"};
        String color = "black";

        //При вызове метода Generic-типа <String> можно передавать только String
        System.out.println(GenericMethods.<String>inArray(colors, color));

        Integer[] integers = {5, 6, 7};
        Integer integer = 4;

        //При вызове метода Generic-типа <Number> можно передавать только Number и его наследников
        System.out.println(GenericMethods.<Number>inArray(integers, integer));
        System.out.println(GenericMethods.<Number, String>compareHashCode(12, "12"));
    }
}
