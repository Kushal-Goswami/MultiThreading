class Car implements Runnable
{
    public void run()
    {
        try {

            for (int i=65; i<=71; i++)
            {
                System.out.println((char) i);
                Thread.sleep(2000);
            }
            Thread.sleep(3000);
            synchronized (this) {
                for (int i=65; i<=71; i++)
                {
                    System.out.println((char) i);
                    Thread.sleep(2000);
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class LaunchMT8 {
    public static void main(String[] args) {

        Car c=new Car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("Child1");
        t2.setName("Child2");
        t3.setName("Parent");
        t1.start();
        t2.start();
        t3.start();


    }
}
