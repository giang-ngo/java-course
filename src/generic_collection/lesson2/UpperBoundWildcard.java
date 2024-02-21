package generic_collection.lesson2;

import java.util.ArrayList;

public class UpperBoundWildcard {
    public static double averageValue(ArrayList<? extends Number> list) {
        if (list == null || list.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (var e : list) {
            sum += e.doubleValue();
        }
        return sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(19);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(3.56);
        doubles.add(90.11);
        doubles.add(1.3);


        ArrayList<String> names = new ArrayList<>();
        names.add("Phuong");
        names.add("Vu");
        names.add("Vy");
        names.add("Hoa");


        System.out.printf("Giá trị trung bình các số nguyên: %5.2f\n",
                averageValue(integers));

        System.out.printf("Giá trị trung bình các số thực: %5.2f\n",
                averageValue(doubles));

//        System.out.printf("Giá trị trung bình các String Object: %5.2f\n",
//                averageValue(names));//error
    }
}
