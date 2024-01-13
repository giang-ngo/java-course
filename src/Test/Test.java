package Test;

import inheritance.Child;
import inheritance.Father;
import inheritance.Person;

public class Test {
    public static void main(String[] args) {
//        Person person = new Person();

        Father myFather = new Father();
        Child child = new Child();

//        myFather.setBankAccPassword("0123456*Avx$"); // error!
        child.updateBankInfo("0123456*Avx$"); // ok
    }
}
