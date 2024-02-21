package generic_collection.lesson2;

public class GrandFather {

}

class Father extends GrandFather {

}

class Child extends Father {

}

class GrandChildren extends Child {
    private String name;

    public GrandChildren() {
    }

    public GrandChildren(String name) {
        this.name = name;
    }
}