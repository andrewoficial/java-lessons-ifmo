package lesson05;

import java.util.Arrays;

public class lesson05 {
    public static void main(String[] args) {
        int codes [] = {5, 7, 14};
        //System.out.println(codes[10]); //runtime error Ошибка времени выполенеия.
        // Выход за пределы массива. Out Of Bound

        //Длинна массива - тип Int
        System.out.println(codes.length);

        //Массив не иммутабельный потому что иммутабельными только ссылочные типы
        System.out.println(codes[codes.length - 1]);
       int a = (int) (Math.random()*codes.length);

        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
            if(codes[i] < 1000) codes[i] += 1000;
        }
        
        //iter
        for (int code : codes) {
            System.out.println(code);
        }
        int [] ints01 = new int[10];
        String [] colors = new String[4];

        for (int i = 0; i < ints01.length; i++) {
            ints01[i] = (int) (Math.random() * 30);
        }

        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";
        colors[3] = "White";
        for (String color : colors) {
            if("Red".equalsIgnoreCase(color)){
                System.out.println("Found red color");
            }

        }

// методы для работы с массивами
        double[] temps = {45.7, 22.9, 12.0, 33.8, 98.1};
        // СОРТИРОВКА
        Arrays.sort(temps);
        System.out.println(Arrays.toString(temps));

        // БИНАРНЫЙ ПОИСК
        System.out.println(Arrays.binarySearch(temps, 98.1)); //

        // СОЗДАНИЕ КОПИЙ
        // 1) Позволяет сделать полную копию массива
        double[] newTemps01 = temps.clone();
        System.out.println(Arrays.toString(newTemps01));

        // 2) Позволяет скопировать несколько первых элементов массива или сделать полную копию массива
        double[] newTemps02 = Arrays.copyOf(temps, 3);
        System.out.println(Arrays.toString(newTemps02));

        // 3) System.arraycopy(Object src, int srcPos, Object dst, int dstPos, int len)
        // Метод копирует len элементов массива src, начиная с позиции srcPos,
        // в массив dst, начиная с позиции dstPos.
        // Массив dst должен иметь достаточный размер, чтобы в нем поместились все копируемые элементы.
        double[] newTemps03 = new double[30];
        System.arraycopy(temps, 0, newTemps03, 10, temps.length);
        System.out.println(Arrays.toString(newTemps03));

        String myAr1 [] = new String [1];
        myAr1 [0] = "Test";
        String myAr2 [] = new String [1];

        System.arraycopy(myAr1, 0, myAr2, 0, myAr1.length);
        System.out.println(myAr1[0] == myAr2[0]); //true

    }
}
