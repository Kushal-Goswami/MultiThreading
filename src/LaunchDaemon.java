class MsWord extends Thread {
    public void run() {
        String tName = Thread.currentThread().getName();

        if (tName.equals("TYPE")) {
            typing();
        } else if (tName.equals("EDIT")) {
            editing();
        } else {
            saving();
        }
    }

    public void typing() {
        try {

            for (int i = 0; i < 4; i++) {
                System.out.println("Typing....");
                Thread.sleep(4000);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void editing() {
        try {
            for (; ; ) {
                System.out.println("Editing....");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void saving() {
        try {
            for (; ; ) {
                System.out.println("Saving....");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LaunchDaemon {
    public static void main(String[] args) {

        MsWord t1 = new MsWord();
        MsWord t2 = new MsWord();
        MsWord t3 = new MsWord();

        t1.setName("TYPE");
        t2.setName("EDIT");
        t3.setName("SAVE");

        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.setPriority(4);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();

    }
}
