import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Thread myThread1 = new Thread(() -> {
            Math.menu(); } );

        myThread1.start();
    }
}
