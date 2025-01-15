package ObjectLevelSynchronization;

public class SBIBank {

    int accountBal;

    public SBIBank(int accountBal)
    {
        this.accountBal=accountBal;
    }

   synchronized public void withdrawal(int withdrawal)
    {
        accountBal=this.accountBal-withdrawal;

    }

   synchronized public void deposit(int deposit)
    {
        accountBal=this.accountBal+deposit;
    }

   synchronized public void checkBal()
    {
        System.out.println("The account balance is "+accountBal);
    }
}
