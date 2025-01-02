import java.util.Scanner;

public class LaunchMT2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Aplication started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        int accNo = sc.nextInt();
        System.out.println("Enter the password");
        int pwd = sc.nextInt();

        System.out.println("Motivational quotes");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Focus is the key");
            Thread.sleep(3000);
        }

        System.out.println("star printing started");
        for (int i = 1; i <= 5; i++) {

            System.out.println("*");
            Thread.sleep(3000);
        }
    }
}
