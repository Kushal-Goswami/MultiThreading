class Loop implements Runnable
{

    @Override
    public void run() {
        try {
            for (int i=65; i<=71; i++)
            {
                System.out.println((char) i);
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        synchronized (this)
        {
            try {
                for (int i=65; i<=71; i++)
                {
                    System.out.println((char) i);
                    Thread.sleep(2000);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }


    }
}
public class LaunchMT7 {
    public static void main(String[] args) {

        Loop l=new Loop();

        Thread t1=new Thread(l);
        Thread t2=new Thread(l);

        t1.start();
        t2.start();
    }
}
