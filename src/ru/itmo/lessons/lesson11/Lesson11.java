package ru.itmo.lessons.lesson11;

public class Lesson11 {
    public static void main(String[] args) {
        Point point01 = new Point (12, -33);
        Point point02 = new Point (12, -33);
        Point pointCopy = point01.clone();
        System.out.println(pointCopy.equals(point01));
        System.out.println(pointCopy == point01);

        System.out.println(point01);
        System.out.println(point02);
        Figure figure01 = new Figure(3);
        //figure01.addPoint(point01);
        //figure01.addPoint(point02);

        System.out.println(point01.equals(point02));

    }
}
