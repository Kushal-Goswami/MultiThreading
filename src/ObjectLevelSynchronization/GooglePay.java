package ObjectLevelSynchronization;

public class GooglePay extends Thread{

    private SBIBank bank;

    public GooglePay(SBIBank bank)
    {
        this.bank=bank;
    }
    @Override
    public void run()
    {
        bank.checkBal();
    }
}
