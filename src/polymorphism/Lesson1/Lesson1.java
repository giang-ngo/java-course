package polymorphism.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
//        Person person = new Person();
//        Student student = new Student();
//        Person nam = new Student();
//        person.work(); // gọi phương thức từ đối tượng của person
//        System.out.println("=====================================");
//        student.work(); // gọi phương thức từ đối tượng của Student
//        System.out.println("=====================================");
//        nam.work(); // gọi phương thức từ đối tượng person tham chiếu đến Student

        Animal cat = new Cat();
        Animal fish = new Fish();
        Animal bird = new Bird();
        Animal animal = new Animal();

        cat.move();
        fish.move();
        bird.move();
        animal.move();
    }
}

