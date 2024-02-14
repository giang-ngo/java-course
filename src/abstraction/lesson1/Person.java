package abstraction.lesson1;

import java.util.Date;

public abstract class Person {
    private String id;      // số chứng minh thư/căn cước/hộ chiếu
    private String name;    // họ tên
    private String address; // địa chỉ
    private Date dateOfBirth; // ngày sinh

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // hành động kiếm tiền của người nói chung
    protected abstract void earnMoney();
}

class Student extends Person {
    private String studentId;
    private String major;
    private float avgGrade;


    @Override
    public void earnMoney() {
        System.out.println("Sinh viên đi kiếm tiền bằng cách đi làm thêm");
    }
}

class Instructor extends Person {
    @Override
    protected void earnMoney() {
        System.out.println("Giảng viên kiếm tiền bằng cách đi dạy");
    }
}

class Programmer extends Person {
    @Override
    protected void earnMoney() {
        System.out.println("Lập trình viên kiếm tiền bằng cách đi code dạo");
    }
}
