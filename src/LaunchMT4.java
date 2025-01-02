import java.util.Scanner;

class Alpha2 implements Runnable {
    @Override
    public void run() {
        banking();
    }

    public void banking() {
        System.out.println("Banking started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        int accNo = sc.nextInt();
        System.out.println("Enter the password");
        int pwd = sc.nextInt();
    }
}

class Beta2 implements Runnable {
    @Override
    public void run() {
        motiveQuote();
    }

    public void motiveQuote() {
        System.out.println("Motivational quotes");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Focus is the key");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Gamma2 implements Runnable {
    @Override
    public void run() {
        starPrint();
    }

    public void starPrint() {
        System.out.println("Star printing started");
        for (int i = 1; i <= 5; i++) {

            System.out.println("*");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class LaunchMT4 {
    public static void main(String[] args) {

        Alpha2 a2 = new Alpha2();
        Beta2 b2 = new Beta2();
        Gamma2 g2 = new Gamma2();

        Thread thread1 = new Thread(a2);
        Thread thread2 = new Thread(b2);
        Thread thread3 = new Thread(g2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
