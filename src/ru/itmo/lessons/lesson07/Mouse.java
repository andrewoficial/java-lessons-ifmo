package ru.itmo.lessons.lesson07;

public class Mouse {


    private final int speed; //final - не меняется в процессе работы программы
    public Mouse (int speed){
        if(speed < 10){
            throw new IllegalArgumentException("Speed < 10");
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
