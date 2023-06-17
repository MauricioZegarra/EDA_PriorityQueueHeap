public class test {
    public static void main(String[] args) {
        HeapQueue<Integer, Integer> cola = new HeapQueue<Integer, Integer>();
        
        cola.enqueue(4,5);
        cola.enqueue(1,7);
        cola.enqueue(7,6);
        cola.enqueue(5,37);
        cola.enqueue(11,8);
        cola.enqueue(6,100);
        cola.enqueue(-4,96);
        cola.enqueue(0,3);
        cola.enqueue(-1,41);
        cola.enqueue(6,59);
        cola.enqueue(3,11);
        cola.enqueue(8,1);

        System.out.println(cola);

        System.out.println("La mayor prioridad es de: " + cola.Front().getKey() + " y pertenece al elemento con la informacion: " + cola.Front().getData());

        System.out.println("La menor prioridad es de: " + cola.Back().getKey() + " y pertenece al elemento con la informacion: " + cola.Back().getData());

    }
}
