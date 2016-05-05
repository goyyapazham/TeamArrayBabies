import java.util.ArrayList;

public class ArrayPriorityQueue {

    private ArrayList<Comparable> _queue;

    public ArrayPriorityQueue() {
	_queue = new ArrayList<Comparable>();
    }
    
    public void add(Comparable x) {

	//Insert directly into queue if empty
	if (_queue.size() == 0) {
	    _queue.add(x);
	    System.out.println("" + x + this);
	    return;
	}

	//This is very similar to the insertion sort algo
	int insert = _queue.size(); //This stores the insert point. Note how it starts at one plus the final index, which is used if no values are greater than the inserted one.
	Comparable comp = _queue.get(insert-1); //This is the value we're comparing x to

	//Very standard "insertion sort" back traversal, where you walk down the compared value until you reach something that is smaller than it.
	while (insert > 0 && x.compareTo(comp) < 0) {
	    //System.out.println("comp: " + comp + "val: " + x.compareTo(comp));
	    insert--;
	    //This line is to compensate for the fact that we started insert at one plus the index, and so we may have an out of bounds error. 
	    if (insert > 0) {
		comp = _queue.get(insert-1);
	    }
	}
	
	//If nothing has changed with insert, just add to the end
	if (insert == _queue.size()) {
	    _queue.add(x);
	}
	//Else, add at that point.
	else {
	    _queue.add(insert,x);
	}
	//System.out.println("" + x + this);
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
