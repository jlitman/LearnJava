class MyThread extends Thread {
    //construct new thead
    MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + "starting");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        }
        catch(InterruptedException ex) {
            System.out.println(getName() + " interrrupted");
        }
        System.out.println(getName() + " terminating");
    }
}

class ExtendThread{
    public static void main(String args[]) {
        System.out.println("Main thread starting");

        MyThread mt = new MyThread("Child 1");
        for(int i=0;i<50;i++) {
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

