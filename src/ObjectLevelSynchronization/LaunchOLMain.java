package ObjectLevelSynchronization;

public class LaunchOLMain {
    public static void main(String[] args) {
        SBIBank b=new SBIBank(5000);

        Atm atm=new Atm(b);
        atm.setName("ATM");

        PhonePe ppay=new PhonePe(b);
        ppay.setName("PHONEPE");

        GooglePay gpay=new GooglePay(b);
        gpay.setName("GPAY");

        atm.start();
        ppay.start();
        gpay.start();
    }
}
