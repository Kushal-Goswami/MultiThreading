class Library2 implements Runnable {
    String res1 = new String("Java");
    String res2 = new String("DSA");
    String res3 = new String("SpringBoot");

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();

        if (tName.equals("STUDENT1")) {
            try {
                Thread.sleep(4000);
                synchronized (res1) {
                    System.out.println("Student1 has got the resource " + res1);
                    Thread.sleep(4000);
                    synchronized (res2) {
                        System.out.println("Student1 has got the resource " + res2);
                        Thread.sleep(4000);
                        synchronized (res3) {
                            System.out.println("Student1 has got the resource " + res3);
                            Thread.sleep(4000);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                Thread.sleep(4000);
                synchronized (res3) {
                    System.out.println("Student2 has got the resource " + res3);
                    Thread.sleep(4000);
                    synchronized (res2) {
                        System.out.println("Student2 has got the resource " + res2);
                        Thread.sleep(4000);
                        synchronized (res1) {
                            System.out.println("Student2 has got the resource " + res1);
                            Thread.sleep(4000);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class LauchLibraryDeadLock {
    public static void main(String[] args) {

        Library2 lib = new Library2();

        Thread st1 = new Thread(lib);
        Thread st2 = new Thread(lib);

        st1.setName("STUDENT1");
        st2.setName("STUDENT2");

        st1.start();
        st2.start();
    }
}
