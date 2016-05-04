import java.util.ArrayList;

public class ArrayPriorityQueue {

    private ArrayList<Comparable> _queue;

    public ArrayPriorityQueue() {
	_queue = new ArrayList<Comparable>();
    }
    
    public void add(Comparable x) {
	boolean added = false;
	for(int i = _queue.size() - 1; i >= 0; i--) {
	    if(_queue.get(i).compareTo(x) >= 0) {
		_queue.add(i, x);
		added = true;
		break;
	    }
	}
	if(!added) _queue.add(x);
    }

    public boolean isEmpty() {
        return _queue.size() == 0;
    }

    public Object peekMin() {
	return _queue.get(0);
    }

    public Object removeMin() {
	Object ret = peekMin();
	_queue.remove(0);
	return ret;
    }

    public String toString() {
	return _queue.toString();
    }

    public static void main(String[] args) {
	ArrayPriorityQueue nala = new ArrayPriorityQueue();
	System.out.println("printing nala..." + nala);
	System.out.println("adding to nala...");
	nala.add(4);
	nala.add(7);
	nala.add(23);
	nala.add(19);
	nala.add(1);
	nala.add(12);
	nala.add(6);
	System.out.println("printing nala..." + nala);
    }

}
