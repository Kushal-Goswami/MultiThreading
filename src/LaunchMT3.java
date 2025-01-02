import java.util.Scanner;

class Alpha extends Thread {
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

class Beta extends Thread {
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

class Gamma extends Thread {
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

public class LaunchMT3 {
    public static void main(String[] args) {
        Alpha thread1 = new Alpha();
        Beta thread2 = new Beta();
        Gamma thread3 = new Gamma();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
