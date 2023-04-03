package ru.itmo.lessons.lesson07;

public class Mouse {
    private final int speed; //final - не меняется в процессе работы программы

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    public Mouse (int speed){
        if(speed < AnimalsSettings.MOUSE_MIN_SPEED){
            throw new IllegalArgumentException("Speed < " + AnimalsSettings.MOUSE_MIN_SPEED);
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public static Mouse getMouse(){
        String[] colors = {"blue", "green", "red", "transparent LOL"};
        Mouse mouse = new Mouse((int)Math.random()*50);
        mouse.setColor(colors[(int)Math.random()*colors.length]);
        return mouse;
    }
}
