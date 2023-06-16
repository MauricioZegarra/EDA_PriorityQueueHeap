public class HeapQueue <E extends Comparable<E>, T>{

    private ArrayList<Node<E, T>> queue;

    public HeapQueue(){
        this.queue = new ArrayList<Node<E, T>>()
    }

    public boolean isEmpty() {
        return this.queue.size() == 0;
    }

    public void enqueue (E key, T data) {
        
        Node <E, T> aux = new Node(key, data);
        
        int pos = this.queue.size();
        this.queue.add(aux);

        for (int i = (pos - 1)/2; queue.get(i).getKey().compareTo(aux.getKey()) <= 0; i = i/2) {
            Node<E, t> aux2 = queue.get(i);
            queue.put(i, aux);
            queue.put(pos, aux2);
            pos = i;
        }
    }

}
