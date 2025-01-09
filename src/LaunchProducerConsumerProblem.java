class Producer extends Thread {

    Queue que;
    int i=0;

    public Producer(Queue q)
    {
        que=q;
    }
    @Override
    synchronized public void run()
    {
        while (true) {
            que.produce(i++);
        }
    }
}

class Consumer extends Thread {
    Queue que;

    public Consumer(Queue q)
    {
        que=q;
    }
    @Override
     public void run() {

        while (true) {
            que.consume();
        }

    }
}

class Queue {
    int data;
    boolean flag = false;

    synchronized public void produce(int value) {
        try {


            if (flag == true) {
                System.out.println("Production in waiting stage");
                wait();
            } else {
                data = value;
                System.out.println("I have Produced data " + data);
                flag = true;
                notify();
            }
        }
        catch (Exception e)
        {
            System.out.println(" ");
        }
    }

    synchronized public void consume() {
        try {


            if (flag == false) {
                System.out.println("Consumer in waiting stage");
                wait();
            } else {

                System.out.println("I have Consumed data " + data);
                flag = false;
                notify();
            }
        }
        catch (Exception e)
        {
            System.out.println(" ");
        }
    }


}

public class LaunchProducerConsumerProblem {
    public static void main(String[] args) {

            Queue que=new Queue();

            new Producer(que).start();
            new Consumer(que).start();

    }
}
