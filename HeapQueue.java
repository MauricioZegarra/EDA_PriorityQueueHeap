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

    public Node<E, T> Front() {
        return this.queue.get(0);
    }

    public Node<E, T> Back() {

        Node<E, T> menor = this.queue.get(0);

        for (int i = 1; i < this.queue.size(); i++) {
            Node<E, T> actual = this.queue.get(i);

            if (menor.getKey().compareTo(actual.getKey()) > 0) {
                menor = actual;
            }
        }

        return menor;
    }
    
    public void dequeue() {
        this.queue.set(0, this.queue.get(this.queue.size() - 1));
        this.queue.remove(this.queue.size() - 1);
        
        for (int i = 0; i < this.queue.size()/2; ) {
            int left = 2*i + 1;
            int right = 2*i + 2;
            int max = left;
            
            if (left < this.queue.size() && right < this.queue.size()) {
                if (this.queue.get(left).getKey().compareTo(this.queue.get(right).getKey()) < 0) {
                    max = right;
                }
            }
            
            Node<E,T> aux = new Node<E, T> (this.queue.get(max).getKey(), this.queue.get(max).getData());
            
            if (this.queue.get(i).getKey().compareTo(aux.getKey()) < 0) {
                this.queue.set(max, this.queue.get(i));
                this.queue.set(i, aux);
            }
                
            i = 0;
            i += max;
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
