import java.util.Scanner;

public class Math extends Thread{

    public static void menu ()  {
        Scanner scanner = new Scanner(System.in);
        Thread myThread2 = new Thread(() -> {
            Math.math(); } );
        System.out.println("------------МЕНЮ-----------\n" +
                "1. Возвести число в степень\n" +
                "2. Выход\n" +
                "Введите цифру необходимого пункта:");
        int reply = scanner.nextInt();
        if (reply == 1){
                myThread2.start();
        }
        else{
            System.out.println("Выход");
        }
    }

    public static void math(){
        Scanner scanner = new Scanner(System.in);
        Thread myThread1 = new Thread(() -> {
            Math.menu(); } );
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Введите степень:");
        int exponent = scanner.nextInt();
        int answer = 1;
        System.out.println("Расчет будет произведен через 10 секунд.\n");
        myThread1.start();
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка расчета");
        }
        for (int i = 0; i < exponent; i++){
             answer = answer * number;
        }
        System.out.println("Число "+ number + ", в степени " + exponent + " = " + answer);
    }
}
