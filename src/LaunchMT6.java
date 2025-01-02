class Bathroom implements Runnable
{
    synchronized public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName() +" has entered the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() +" is using the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() +" is exit the bathroom");
            Thread.sleep(2000);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class LaunchMT6 {
    public static void main(String[] args) {

        Bathroom b=new Bathroom();

        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        Thread t3=new Thread(b);

        t1.setName("Boy");
        t2.setName("Girl");
        t3.setName("TransGender");

        t1.start();
        t2.start();
        t3.start();
    }
}
