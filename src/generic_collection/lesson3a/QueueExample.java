package generic_collection.lesson3a;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Nam");
        queue.add("Trung");
        queue.add("Nhung");
        queue.add("Hoa");

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        if (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        System.out.println(queue);
    }
}
