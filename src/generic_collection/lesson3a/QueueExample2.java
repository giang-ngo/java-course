package generic_collection.lesson3a;

import java.util.ArrayDeque;

public class QueueExample2 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Vy");
        deque.addLast("Vu");
        deque.add("Nam");
        deque.add("Long");
        deque.addFirst("Hien");

        System.out.println("Cuối: " + deque.removeLast());
        System.out.println("?: " + deque.remove());

        System.out.println("Số phần tử: "+deque.size());
        System.out.println(deque);
    }
}
