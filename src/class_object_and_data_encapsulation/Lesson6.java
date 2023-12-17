package class_object_and_data_encapsulation;

public class Lesson6 {
    public static void main(String[] args) {
        Order order1 = new Order(); // tạo đơn hàng thứ nhất
        Order order2 = new Order(); // tạo đơn hàng thứ hai
        Order order3 = new Order(); // tạo đơn hàng thứ ba
        // .. tạo đơn hàng thứ n...
        System.out.println("order1 id = " + order1.getId());
        System.out.println("order2 id = " + order2.getId());
        System.out.println("order3 id = " + order3.getId());
    }
}
