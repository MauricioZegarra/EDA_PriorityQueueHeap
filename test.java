public class test {
    public static void main(String[] args) {
        HeapQueue<Integer, Integer> cola = new HeapQueue<Integer, Integer>();
        
        cola.enqueue(4,5);
        cola.enqueue(1,7);
        cola.enqueue(7,6);
        cola.enqueue(5,8);
        cola.enqueue(11,8);
        cola.enqueue(6,8);
        cola.enqueue(-4,8);
        cola.enqueue(0,8);
        cola.enqueue(-1,8);
        cola.enqueue(6,8);
        cola.enqueue(3,8);
        cola.enqueue(8,1);

        System.out.println(cola);

    }
}
