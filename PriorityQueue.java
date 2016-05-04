public interface PriorityQueue {

    //add x to valid location based on priority
    void add(Object x);

    //see if quay is em-tay
    boolean isEmpty();

    //capture priority 1 obj
    Object peekMin();

    //remove & return priority 1 obj
    Object removeMin();

}
