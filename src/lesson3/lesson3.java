

package lesson3;
import java.util.Scanner;
public class lesson3 {
    public static void main(String[] args) {
        int a = 0;
        a++; //Постфиксная
        ++a; //Префиксная

        //Ввод
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas enter...");
        int newInt = sc.nextInt();
        System.out.println(newInt);

        //sc.close();

        int printCount = 5;
        while(printCount > 0){
            System.out.println("++");
            printCount--;
        }
        int inp = 0;
        while(true){
            System.out.println("Enter number. 0 for exit");
            inp = sc.nextInt();
            if(inp == 0) break;
            if(inp < 0) continue;
            System.out.println(inp * inp);
        }

        //sc.close();

        Scanner taskScan = new Scanner(System.in);
        int plats = taskScan.nextInt();
        double fairy = taskScan.nextDouble();
        while(plats > 0 && fairy > 0){
            plats -= 1;
            fairy -= 0.5;
        }
        System.out.println(plats);
        System.out.println(fairy);

        //fori
        for(int i=35; i >= 0; i -= 5){
            System.out.println(i);
        }
    }
}
