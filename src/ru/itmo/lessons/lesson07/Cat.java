package ru.itmo.lessons.lesson07;

public class Cat {


    private String name;
    private final int speed;

    private final int weight;
    private Mouse [] mice;
    private int index;
    private int victory;

    public Cat (int speed, int weight){
        if(speed < AnimalsSettings.CAT_MIN_SPEED){
            throw new IllegalArgumentException("Speed < " +  AnimalsSettings.CAT_MIN_SPEED);
        }
        if(weight < AnimalsSettings.CAT_MIN_WEIGHT){
            throw new IllegalArgumentException("weight < " +  AnimalsSettings.CAT_MIN_WEIGHT);
        }
        this.speed = speed;
        this.weight = weight;
        mice = new Mouse[AnimalsSettings.MICE_COUNT];

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
            System.out.println("don`t selfharm");
            return;
        }

        if(this.weight > cat.weight){
            this.victory++;
        }else{
            cat.victory++;
        }
    }

    public static Cat getCat(){
        Cat tom = new Cat ((int) Math.random()*100 + 10, (int) Math.random()*100 + 10);
        return tom;
    }
}
