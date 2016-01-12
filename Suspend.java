class MyThread55 implements Runnable {
    Thread thrd;

    boolean suspended;
    boolean stopped;

    MyThread55(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    //entry point for thread
    public void run() {
        System.out.println(thrd.getName() + " starting");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                //use synchronized block to check suspended and stopped
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch(InterruptedException ex) {
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " exiting");
    }

    //stop the thread
    synchronized void mystop() {
        stopped = true;
        //the following ensures that a suspended thread can be stopped
        suspended = false;
        notify();
    }

    //suspend the thread
    synchronized void mysuspend() {
        suspended = true;
    }

    //resume the thread
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

class Suspend {
    public static void main(String args[]) {
        MyThread55 ob1 = new MyThread55("My Thread");

        try {
            Thread.sleep(1000);//let ob1 start executing
            ob1.mysuspend();
            System.out.println("suspending thread");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("resuming thread");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("suspending thread");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("resuming thread");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Stopping thread");
            ob1.mystop();
        } catch(InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }

        //wait for thread to finish
        try{
            ob1.thrd.join();
        } catch(InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");
    }
}
