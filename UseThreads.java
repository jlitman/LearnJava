class MyThread implements Runnable {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " starting");
        try {
            for(int count  = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " +
                        count);
            }
        } catch(InterruptedException ex) {
            System.out.println(threadName + " interrupted");
        }
        System.out.println(threadName + " terminating");
    }
}

class UseThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting");

        //make a MyThread object
        MyThread myThread = new MyThread("Child 1");

        //make a thread from that object
        Thread thread = new Thread(myThread);

        //start execution of the thread
        thread.start();

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException ex) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread ending");
    }
}

