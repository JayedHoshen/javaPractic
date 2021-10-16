import java.io.*;

class A extends Thread{
    public void run() {
        for(int i = 1; i <= 5; i += 2) {
            System.out.println("Inside Thread A: i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread{
    public void run() {
        for (int j = 1; j <= 5; j += 2) {
            System.out.println("Inside Thread B: j = " + j);
        }
        System.out.println("Exit from B");
    }
}

public class Multithreaded {
    public static void main(String args[]) {
        A Th1 = new A();
        B Th2 = new B();
        System.out.println("Starting Thread A");
        Th1.start();
        System.out.println("Starting Thread B");
        Th2.start();
        System.out.println("Exit from the Main Thread ");
    }
}
