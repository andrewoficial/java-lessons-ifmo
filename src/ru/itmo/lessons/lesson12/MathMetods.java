package ru.itmo.lessons.lesson12;

public class MathMetods {
    public static int plus(int a, int b) throws CalculatorException{
        if(a < 0 || b < 0){
                throw new CalculatorException("Одна из цифр меньше нуля");
        }
        return a+b;
    }

    public static int minus(int a, int b) throws CalculatorException{
        if(a < 0 || b < 0){
            throw new CalculatorException("Одна из цифр меньше нуля");
        }
        return a+b;
    }

    public static int random(int from, int to){
        return (int) (Math.random() * (to-from)) + from;
    }
}
