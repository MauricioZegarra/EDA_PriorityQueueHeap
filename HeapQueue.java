public class HeapQueue <E extends Comparable<E>, T>{

    private ArrayList<Node<E, T>> queue;

    public HeapQueue(){
        this.queue = new ArrayList<Node<E, T>>()
    }

    public boolean isEmpty() {
        return this.queue.size() == 0;
    }

    public void enqueue (E key, T data) {
        
    }

}
