//use wait and notify to create a ticking clock

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if(!running) { //stop the clock
            state = "ticked";
            notify();//notify any waiting threads
            return;
        }
        System.out.println("Tick ");
        state = "ticked";
        notify();//let tock run
        try {
            while(!state.equals("tocked")) {
                wait(); //wait for tock() to complete
            }
        }
        catch(InterruptedException ex) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while(!state.equals("ticked")) {
                wait();
            }
        }
        catch(InterruptedException ex) {
            System.out.println("Thread interrupted");
        }
    }
}

class MyThread6 implements Runnable {
    Thread thrd;
    TickTock ttObject;

    MyThread6(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttObject = tt;
        thrd.start();
    }

    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++) {
                ttObject.tick(true);
            }
            ttObject.tick(false);
        }
        else {
            for(int i = 0; i < 5; i++) {
                ttObject.tock(true);
            }
            ttObject.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String args[]) {
            TickTock tt = new TickTock();
            MyThread6 mt1= new MyThread6("Tick", tt);
            MyThread6 mt2= new MyThread6("Tock", tt);

            try {
                mt1.thrd.join();
                mt2.thrd.join();
            } catch(InterruptedException ex) {
                System.out.println("Main Thread interrupted");
            }
    }
}
