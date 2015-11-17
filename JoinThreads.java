//use join

class SomeThread implements Runnable {
    Thread thrd;

    //make a new thread
    SomeThread(String name) {
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

class JoinThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        SomeThread t1 = new SomeThread("Child 1");
        SomeThread t2 = new SomeThread("Child 2");
        SomeThread t3 = new SomeThread("Child 3");

        try {
            t1.thrd.join();
            System.out.println("Child 1 is joined");
            t2.thrd.join();
            System.out.println("Child 2 is joined");
            t3.thrd.join();
            System.out.println("Child 3 is joined");
        }
        catch(InterruptedException ex) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ended.");
    }
}

