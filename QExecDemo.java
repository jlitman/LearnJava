import qpack.*;
class QExecDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);

        char ch;
        int i;

        try {
            //overrun the queue
            for(i=0;i<11;i++) {
                System.out.println("Attempting to store: " + (char)('A' + i));
                q1.put((char)('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch(QueueFullException ex) {
            System.out.println(ex);
        }
        System.out.println();

        try {
            //empty the queue
            for(i = 0;i<11;i++) {
                System.out.println("Getting next char: ");
                ch = q1.get();
                System.out.println(ch);
            }
        }
        catch(QueueEmptyException ex) {
            System.out.println(ex);
        }
    }
}
