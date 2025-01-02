public class LaunchMT1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started");
//        Thread.sleep(3000);

        Thread cthread = Thread.currentThread();
        System.out.println(cthread.getName());
        System.out.println(cthread.getPriority());
//        cthread.setName("Bank");
//        cthread.setPriority(3);
//        System.out.println(cthread.getName());
//        System.out.println(cthread.getPriority());


        System.out.println("Application ended");
    }
}
