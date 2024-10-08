import java.util.*;

public class MyQueue<T> {
    private LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.add(element);
    }

    public List<T> getLastElements(int n) {
        return queue.subList(queue.size() - n, queue.size());
    }

    public void displayQueue() {
        System.out.println("Current queue: " + queue);
    }
}
