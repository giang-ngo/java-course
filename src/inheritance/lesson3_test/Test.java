package inheritance.lesson3_test;

import inheritance.lesson3.Child;
import inheritance.lesson3.Father;

public class Test {
    public static void main(String[] args) {

//        Person person = new Person();// error!Không cho truy cập khác gói

        Father myFather = new Father();
        Child child = new Child();

//        myFather.setBankAccPassword("0123456*Avx$"); // error!Không cho truy cập khác gói
        child.updateBankInfo("0123456*Avx$"); // ok
    }
}
