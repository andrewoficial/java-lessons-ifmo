package ru.itmo.lessons.lesson12;

public class Application {
    public static void main(String[] args) {
        System.out.println(MathMetods.random(4, 15));
        try {
            System.out.println(MathMetods.plus(-4, 5));
        }catch(CalculatorException obj){
            System.out.println(obj.getMessage());
            throw new RuntimeException(obj.getMessage(), obj);
        }finally {
            System.out.println("Освобождение ресурсов");
        }
    }
}


