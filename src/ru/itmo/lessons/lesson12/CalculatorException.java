package ru.itmo.lessons.lesson12;

public class CalculatorException extends Exception{
    public CalculatorException(String msg){
        super(msg);
    }

    public CalculatorException(Throwable cause, String message){
        super(message, cause);
    }
    @Override
    public String getMessage(){
        return "MyMessage: " + super.getMessage();
    }
}

