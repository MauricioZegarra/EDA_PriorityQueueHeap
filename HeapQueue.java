import java.util.ArrayList;

public class HeapQueue <E extends Comparable<E>, T>{

    private ArrayList<Node<E, T>> queue;

    public HeapQueue(){
        this.queue = new ArrayList<Node<E, T>>();
    }

    public boolean isEmpty() {
        return this.queue.size() == 0;
    }

    public void enqueue (E key, T data) {
        Node<E, T> aux = new Node<E, T>(key, data);    
        this.queue.add(aux);
        
        int size = this.queue.size();

        if (size > 1) {
            int pos = size - 1;
            int father = (pos - 1)/2;

            while (this.queue.get(pos).getKey().compareTo(this.queue.get(father).getKey()) > 0) {
                Node<E, T> aux2 = new Node<E, T>(this.queue.get(father).getKey(), this.queue.get(father).getData());

                this.queue.set(father, this.queue.get(pos));
                this.queue.set(pos, aux2);
                
                pos = father;
                father = (pos - 1)/2;
            }
        }
    }

    public String toString() {
        String str = "";

        for (Node<E, T> aux : queue) {
            str += aux.getKey() + ", ";
        }

        return str;
    }

}
