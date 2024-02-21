package generic_collection.lesson3a;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> friends = new Stack<>();
        friends.push("Thao");
        friends.push("Nam");
        friends.push("Yen");
        friends.push("Nhung");

        System.out.println("Top: " + friends.peek());
        friends.pop();
        System.out.println("Top: " + friends.peek());
        friends.pop();
        friends.pop();
        friends.pop();
        if (!friends.isEmpty()) {
            friends.pop();
            System.out.println("Top: " + friends.peek());
        }
    }
}
