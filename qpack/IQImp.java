package qpack;
public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char c) throws QueueFullException {
        if(putloc == q.length) {
            throw QueueFullException(q.length);
        }
        q[putloc++] = c;
    }

    public char get() throws QueueEmptyException {
        if(getloc == putloc) {
            throw QueueEmptyException();
        }
        return q[getloc++];
    }
}

public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char c) {
        //queue is full if either putloc is one less than getloc or if putloc
        //is at the end of the array and getloc is at the beginning
        if((putloc+1 == getloc) || (putloc == q.length-1 && getloc == 0)) {
            System.out.println("Queue is full");
            return;
        }
        q[putloc++] = c;
        if(putloc == q.length){
            putloc = 0;
        }
    }

    public char get() {
        if(getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        char c = q[getloc++];
        if(getloc == q.length) {
            getloc = 0;
        }
        return c;
    }
}


public class DynQueue implements ICharQ {
    private char q[];
    private int putloc,getloc;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char c) {
        if(putloc == q.length) {
            //queue is full, increase length
            char t[] = new char[q.length*2];

            for(int i = 0;i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
            q[putloc++] = c;
    }

    public char get() {
        if(getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

