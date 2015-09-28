package qpack;
//A character queue interface
public interface ICharQ {
    void put(char c) throws QueueFullException;
    char get() throws QueueEmptyException;
}
