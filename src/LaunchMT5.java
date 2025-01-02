import java.util.Scanner;

class Alpha3 implements Runnable {
    @Override
    public void run() {
        String tName=Thread.currentThread().getName();

        if (tName.equals("Bank"))
        {
            banking();
        }

        else if (tName.equals("MotiveQuote"))
        {
            motiveQuote();
        }
        else
        {
            starPrint();
        }



    }

    public void banking() {
        System.out.println("Banking started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        int accNo = sc.nextInt();
        System.out.println("Enter the password");
        int pwd = sc.nextInt();
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


public class LaunchMT5 {
    public static void main(String[] args) {

        Alpha3 al=new Alpha3();

        Thread th1=new Thread(al);
        Thread th2=new Thread(al);
        Thread th3=new Thread(al);

        th1.setName("Bank");
        th2.setName("MotiveQuote");
        th3.setName("Star");

        th1.start();
        th2.start();
        th3.start();

    }
}
