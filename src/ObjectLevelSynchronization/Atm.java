package ObjectLevelSynchronization;

public class Atm extends Thread{

    private SBIBank bank;
    public Atm(SBIBank b)
    {
        this.bank=b;
    }
     @Override
     public void run()
     {
         bank.withdrawal(5000);
         try {
             Thread.sleep(30000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
     }
}
