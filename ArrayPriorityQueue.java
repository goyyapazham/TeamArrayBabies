import java.util.ArrayList;

public class ArrayPriorityQueue {

    private ArrayList<Comparable> _queue;

    public ArrayPriorityQueue() {
	_queue = new ArrayList<Comparable>();
    }
    
    public void add(Object x) {
	for(int i = _queue.size() - 1; i >= 0; i--) {
	    if(_queue.get(i).compareTo(x) >= 0) {
		_queue.add(x, i);
		break;
	    }
	}   
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

}
