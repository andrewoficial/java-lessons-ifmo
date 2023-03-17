package lesson02;

public class lesson02 {
    public static void main(String[] args) {
        var version = 10;
        var connected = true;
        var balance = 104.5;
        var weight = 50.5F;
        var price = (short) 290;

        double sum = 4000;
        sum = sum > 10000 ? sum - (sum * 0.1) : sum;
        System.out.println(sum);


        double age = 31;
        double exp = 3;
        if(age < 18 || age > 200){
            System.out.println("Мы вам перезвоним!");
        }else{
            if(exp < 5) {
                System.out.println("Вы подходите на должность младшего разработчика");
            }else {
                System.out.println("Вы подходите на должность старшего разработчика");
            }
        }

    }
}
