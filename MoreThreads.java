//create multiple threads

class AThread implements Runnable {
    Thread thrd;

    //make a new thread
    AThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    //being execution of thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException ex) {
            System.out.println(thrd.getName()+ " interuppted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting");

        AThread t1 = new AThread("Child 1");
        AThread t2 = new AThread("Child 2");
        AThread t3 = new AThread("Child 3");

        for(int i = 0; i< 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException ex) {
                System.out.println("Main thread interuppted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
