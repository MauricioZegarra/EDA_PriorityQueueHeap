public class Node <E, T> {

    private E key;
    private T data;
    
    public Node(E key, T data) {
        this.key = key;
        this.data = data;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
