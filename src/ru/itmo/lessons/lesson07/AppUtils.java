package ru.itmo.lessons.lesson07;

public class AppUtils {
    public static int getMax(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }

    public static String getShortStr(String a, String b){
        if(a.length() > b.length()){
            return b;
        }
        return a;
    }

    public static int getInRange(int a, int b){
        return (int)Math.random()*((b-a)+a);
    }
}
