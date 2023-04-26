package ru.itmo.lessons.lesson19;

import ru.itmo.lessons.lesson14.Fruit;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Lesson19 {
    public static void main(String[] args) {
        BinaryOperator<Double> plus01  = (d01, d02) -> d01+d02;
        System.out.println(plus01.apply(2.0, 2.0));

        //ИмяКласса::имяМетода - ссылка на метода
        BinaryOperator<Double> plus02 = Double::sum; //компилятор подставляет метод (d01, d02){ return d01 + d02}
        System.out.println(plus02.apply(2.0, 2.0));


        Comparator<Fruit> byType01 = (f1, f2) -> f1.getType().compareTo(f2.getType());
        Comparator<Fruit> byType02 = Comparator.comparing(fruit -> fruit.getType());
        Comparator<Fruit> byType03 = Comparator.comparing(Fruit::getType);
        Comparator<Fruit> fruitComparator = Comparator.comparing(Fruit::getCount)
                .reversed()//Развернули натур порядок
                .thenComparing(Fruit::getType)
                .thenComparing(Fruit::getPrice);

        Stream<Integer> temps01 = Stream.of(-560, 312, 12, -55, -100, 45, 0, 0, 23, -20, 221);

        temps01.filter(integer -> integer < 0)
                .sorted()
                .limit(3)//boolean test(T t);
                .map(integer -> integer + " deg") // R apply (T t);
                .forEach(s -> System.out.println(s)); //void accept(T t);

        Stream<Integer> temps02 = Stream.of(-560, 45, 312, 12, -55, -100, 100, 45, 23, -20, 221, 100, 34);
        temps02.distinct()
                .map(integer -> integer<0?0:integer)
                //.sorted(Comparator.comparing(integer -> integer)) //лучше .sorted(Comparator.reverseOrder())
                .sorted(Comparator.reverseOrder())
                .map(integer -> integer + " deg") // R apply (T t);
                .map(integer -> integer.toUpperCase()) // R apply (T t);
                .forEach(s -> {
                    if(! s.equals("0 DEG"))  System.out.println(s);
                }); //void accept(T t);


        String[] colors = {"white", "black", "red", "yellow", "yellowgreen", "green", "dark yellow"};
        long count = Arrays.stream(colors)
                .filter(str -> !str.contains("yellow"))
                .count();
        System.out.println(count);

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 5));
        fruits.add(new Fruit(Fruit.FruitType.BANANA, 80, 12));
        fruits.add(new Fruit(Fruit.FruitType.APRICOT, 300, 2));
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 10));
        fruits.add(new Fruit(Fruit.FruitType.PEAR, 180, 2));
        fruits.add(new Fruit(Fruit.FruitType.PEAR, 180, 8));
        fruits.add(new Fruit(Fruit.FruitType.BANANA, 130, 8));

        boolean result = fruits.stream()
                .peek(fr -> {
                    if(fr.getCount() < 5) fr.setPrice(fr.getPrice() * 2);
                })
                .filter(fr -> fr.getPrice() < 100)
                .anyMatch(fr -> fr.getType() == Fruit.FruitType.BANANA);
        if(result){
            System.out.println("В потоке найден ");
        }


        Fruit minByPrice = fruits.stream()
                .peek(fr -> {
                    if(fr.getCount() < 10) fr.setPrice(fr.getPrice() - (fr.getPrice() * 0.1));
                })
                .min(Comparator.comparing(Fruit::getPrice))
                .get();

        System.out.println(minByPrice);


    }
}
