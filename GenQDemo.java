class GenQDemo {
    public static void main(String args[]) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of integers:");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + i + " to q");
                q.put(i);
            }
        }
        catch(QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            for(int i=0; i<5; i++) {
                System.out.print("Getting next Integer from q ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch(QueueEmptyException e) {
            System.out.println(e);
        }
        System.out.println();

        //create a double q
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);
        Double dVal;

        System.out.println("Demonstrate a queue of doubles:");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + (double)i/2 + " to q2");
                q2.put((double)i/2);
            }
        }
        catch(QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            for(int i=0; i<5; i++) {
                System.out.print("Getting next Double from q2 ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        }
        catch(QueueEmptyException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
