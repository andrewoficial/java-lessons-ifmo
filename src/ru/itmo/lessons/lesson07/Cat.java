package ru.itmo.lessons.lesson07;

public class Cat {


    private String name;
    private final int speed;

    private final int weight;
    private Mouse [] mice;
    private int index;
    private int victory;

    public Cat (int speed, int weight){
        if(speed < 10){
            throw new IllegalArgumentException("Speed < 10");
        }
        if(weight < 1 || weight > 1000){
            throw new IllegalArgumentException("weight < 1 or weight > 1000");
        }
        this.speed = speed;
        this.weight = weight;
        mice = new Mouse[100];

    }

    public void setName(String name) {
        if(name == null || name.length() < 1){
            throw new IllegalArgumentException("wrong name");
        }
        this.name = name;
    }

    public void catchMouse(Mouse mouse){
        if(mouse == null){
            System.out.println("Mouse cant be null");
            return;
        }
        if(this.speed >= mouse.getSpeed()){
            System.out.println(name + " lost the mouse");
            return;
        }

        if(index <  mice.length){
            mice[index] = mouse;
            index++;
        }else{
            System.out.println("Array for mouse is full");
        }
    }

    public void attackCat(Cat cat){


        if(cat == null){
            System.out.println("cat cant be null");
            return;
        }

        if(cat == this){
            System.out.println("don`t selfhatm");
            return;
        }

        if(this.weight > cat.weight){
            this.victory++;
        }else{
            cat.victory++;
        }
    }
}
