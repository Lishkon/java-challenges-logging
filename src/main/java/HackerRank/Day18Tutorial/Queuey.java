package HackerRank.Day18Tutorial;


import java.util.LinkedList;

public class Queuey {

    LinkedList queue;

    // Making a queue
    public Queuey() {
        queue = new LinkedList();
    }

    // Is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // What's our queue's size?
    public int size() {
        return queue.size();
    }

    public void enqueue(int n) {
        queue.addLast(n);
    }

    public int dequeue() {
        return (int) queue.remove(0);
    }

    public int peek() {
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Queuey q = new Queuey();
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(7);
        System.out.println("First out: " + q.dequeue());
        System.out.println("Second out: " + q.dequeue());
        System.out.println("Third out: " + q.dequeue());
    }
}
