package chapter8_Interfaces.tasks.qpack;

// A dynamic queue.
public class DynQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public DynQueue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    @Override
    // Put a characer into the queue.
    public void put(char ch) {
        if(putloc==q.length) {
            // increase queue size
            char t[] = new char[q.length * 2];
            //создаётся новый массив с двойной размерностью
            // copy elements into new queue
            for(int i=0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
    }

    @Override
    // Get a character from the queue.
    public char get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}