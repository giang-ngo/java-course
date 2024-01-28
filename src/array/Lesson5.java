package array;

public class Lesson5 {
    public static void main(String[] args) {
//        System.out.println(STR."Tổng 1 số: \{add(255)}");
//        System.out.println(STR."Tổng 2 số: \{add(255, 1)}");
//        System.out.println(STR."Tổng 3 số: \{add(255, 2, 3)}");
//        System.out.println(STR."Tổng 4 số: \{add(255, 1, 2, 3)}");
//        System.out.println(STR."Tổng 4 số: \{add(new int[]{1, 56, 7, 9, 10, 11})}");

        var line1 = createLine(" ","Hi", "There");
        var line2 = createLine(" - ","Hi", "There", "Hello");
        var line3 = createLine("_","Hi", "There", "          ", "Are", "You", "    ", "Good", "Day");
        System.out.println(STR."Dòng 1: \"\{line1}\"");
        System.out.println(STR."Dòng 2: \"\{line2}\"");
        System.out.println(STR."Dòng 3: \"\{line3}\"");
    }


//    public static int add(int... numbers) {
//        var sum = 0;
//        for (var number : numbers) {
//            sum += number;
//        }
//        return sum;
//    }

    public static String createLine(String delimiter, String... words) {
        var line = new StringBuilder();
        for (var word : words) {
            if (!word.isBlank()) {
                line.append(word).append(delimiter);
            }
        }
        if (!line.isEmpty()) {
            line.deleteCharAt(line.lastIndexOf(delimiter));
        }
        return line.toString();
    }


}
