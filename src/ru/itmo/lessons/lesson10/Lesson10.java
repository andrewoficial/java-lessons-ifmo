package ru.itmo.lessons.lesson10;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {
        Country country1 = Country.UK;
        Country country2 = Country.UK;

        //Сравнение элементов перечисления через ==
        //идентично сравнению через equals
        System.out.println(country1 == country2);    //true
        System.out.println(country1 == Country.UK);  //true
        System.out.println(country1 == Country.USA); //false

        Article art01 = new Article("Путишествия по Британии");
        art01.setCountry(Country.UK);
        System.out.println();

        //методы enum
        //получение массива констант
        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries));


        //Индекс элемента перечисления в массиве
        //
        System.out.println(Country.FRANCE.ordinal()); //2

        for (Country country : countries) {
            //Методы name и toString по умолчанию вернут строковое представление объектов
            //НО: метод name нельзя переопределить, а toString можно переопределить
            System.out.println(country.name());
            System.out.println(country.toString());
            System.out.println();
        }
        //методы equals, hashCode, clone в enum переопределять нельзя

        System.out.println(Priority.HIGH.getCode());
        Priority priority = Priority.MEDIUM;
        System.out.println(priority.MEDIUM);

        Priority[] priorities = Priority.values();
        for (Priority priorityElem : priorities) {//iter
            System.out.println(priorityElem.getCode());
        }
    }
}
