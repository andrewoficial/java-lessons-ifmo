package ru.itmo.lessons.lesson10;

//Может создаваться с любыми св-вами конструкторами и методами

//Priority extend Enum, поэтому наследование перечислений запрещено
public enum Priority /* можно имплементировать интерфейс */{
    HIGH(1), MEDIUM(2), LOW(3);



    private int code; //сразу у всех объектов св-во появляется

    Priority(int code){//Доступен только внутри перечисления
        this.code = code;
    }

    //Методы доступны всем элементам перечисления
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
