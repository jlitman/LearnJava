//demo thread priorities

class Priority implements Runnable {
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;

    //make a new thread. this ctor does not start the threads running
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    //start thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;

            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        }while(stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " terminating");
    }
}

class PriorityDemo {
    public static void main(String args[]) {
        Priority p1 = new Priority("High Priority");
        Priority p2 = new Priority("Low Priority");

        //set priorities
        p1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        p2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        //start the threads
        p1.thrd.start();
        p2.thrd.start();

        try {
            p1.thrd.join();
            p2.thrd.join();
        }
        catch(InterruptedException ex) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("High priority thread counted to " + p1.count);
        System.out.println("Low priority thread counted to " + p2.count);
    }
}
