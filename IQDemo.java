import qpack.*;
class IQDemo {
    public static void main(String args[]) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;

        iQ = q1;
        //put some chars into the FixedQueue
        for(i=0; i< 10; i++) {
            iQ.put((char) ('A' + i));
        }

        //show the queue
        System.out.print("Contents of fixed queue: ");
        for(i = 0; i< 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        //put chars into DynQueue
        for(i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        //show the queue
        System.out.print("Contents of dynamic queue: ");
        for(i = 0; i< 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        //put char into circular queue
        for(i=0;i<10; i++) {
            iQ.put((char)('A'+i));
        }

        //show the queue
        System.out.print("Contents of circular queue: ");
        for(i = 0; i< 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        //put more stuff in circular queue
        for(i=10;i<20;i++) {
            iQ.put((char)('A'+i));
        }
        
        //show the queue
        System.out.print("Contents of circular queue: ");
        for(i = 0; i< 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("\nStore and consume from circular queue");

        for(i=0;i<20;i++) {
            iQ.put((char)('A'+i));
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}
