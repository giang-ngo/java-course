package generic_collection.lesson2;

import java.util.ArrayList;

public class LowerBoundWildcard {
    public static void addNewObjects(ArrayList<? super GrandChildren> list) {
        list.add(new GrandChildren("Hoa"));
        list.add(new GrandChildren("Nhung"));
        list.add(new GrandChildren("Trang"));

    }

    public static void main(String[] args) {
        ArrayList<Father> fathers = new ArrayList<>();
        ArrayList<Child> children = new ArrayList<>();
        ArrayList<GrandChildren> grandChildren = new ArrayList<>();

        addNewObjects(fathers);
        addNewObjects(children);
        addNewObjects(grandChildren);

    }
}
