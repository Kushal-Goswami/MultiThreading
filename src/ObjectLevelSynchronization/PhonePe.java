package ObjectLevelSynchronization;

public class PhonePe extends Thread{
    private SBIBank bank;

    public PhonePe(SBIBank bank)
    {
        this.bank=bank;
    }
    @Override
    public void run()
    {
        bank.deposit(6000);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
