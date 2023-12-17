package class_object_and_data_encapsulation;

// lớp mô tả thông tin đơn hàng
public class Order {
    private int id;
    private static int nextId = 100; // bắt đầu mã đơn hàng từ 100
    private Customer customer;
    private Item item;
    private int quantity;
    private float price;
    //...

    public Order() {
        //...
        setId();
    }

    public int getId() {
        return id;
    }

    // việc thiết lập mã đơn hàng không cần thiết
    // phải public ra ngoài nên ta để là private
    private void setId() {
        this.id = nextId;
        nextId++;
    }
}

// lớp mô tả thông tin mặt hàng
class Item{
    private int id;
    private String name;
    //...
}

// lớp mô tả thông tin của khách hàng
class Customer{
    private String id;
    private String name;
    //...
}
