package ru.itmo.lessons.lesson11;

import java.util.Arrays;

public class Figure {
    private final Point[] points;
    private final int sizeArray;
    private int count = 0;
    public Figure(int sizeArray){
        if(sizeArray < 2)  sizeArray = 2;
        this.sizeArray = sizeArray;
        this.points = new Point[sizeArray];
    }

    public void c(Point point){
        if (point == null) {
            System.out.println("Point не должна быть null");
            return;
        }
        if(points.length == count){
            System.out.println("Массив заполнен");
            return;
        }
        points[count] = point;
        count++;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    @Override
    public /*protected*/ Figure /*Object*/ clone(){
        Figure figure = new Figure(points.length); //Без this потому что объект.клон
        figure.count = count;
        for (int i = 0; i < points.length; i++) {
            figure.points[i] = points[i].clone();
        }
        return figure;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Arrays.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}
