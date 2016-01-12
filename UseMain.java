class UseMain {
    public static void main(String args[]) {
        Thread thrd;

        //get the main thread
        thrd = Thread.currentThread();

        System.out.println("Main thread is called " + thrd.getName());
        System.out.println("Priority " + thrd.getPriority());
        System.out.println();

        //set the name and priority
        System.out.println("Setting the name and priority\n");
        thrd.setName("george");
        thrd.setPriority(Thread.NORM_PRIORITY +1);
        System.out.println("Main thread is now called " + thrd.getName());
        System.out.println("Priority is now " + thrd.getPriority());
        System.out.println();
    }
}
