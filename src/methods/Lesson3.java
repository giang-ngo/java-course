package methods;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
//        BIẾU THỨC SWITCH

//        var input = new Scanner(System.in);
//
//        System.out.println("Nhập số thứ tự ngày của tuần(1->7): ");
//        var index = input.nextInt();
//        System.out.println(dayOfWeek(index));
//        System.out.println(dayOfWeek2(index));


        var question = "Logo hình quả táo cắn dở là của hãng công nghệ nào?";
        var ans = "A. Apple.\nB. Samsung.\nC. Huawei.\nD. Oppo.\n";
        System.out.println(question);
        System.out.println(ans);
        System.out.println("Câu trả lời của bạn là? ");
        var input = new Scanner(System.in);
        char choice = input.next().charAt(0);

//        String result = "";
//        switch (choice) {
//            case 'a':
//            case 'A':
//                result = "Chính xác!";
//                break;
//            case 'b':
//            case 'B':
//            case 'c':
//            case 'C':
//            case 'd':
//            case 'D':
//                result = "Sai mất rồi bạn ơi!";
//                break;
//            default:
//                result = "Vui lòng chọn các đáp án: A, B, C hoặc D";
//                break;
//        }


        String result =
                switch (choice) {
                    case 'a', 'A':
                        yield "Chính xác!";
                    case 'b', 'B', 'c', 'C', 'd', 'D':
                        yield "Sai mất rồi bạn ơi!";
                    default:
                        yield "Vui lòng chọn các đáp án: A, B, C hoặc D";

                };
        System.out.println(result);
    }

//    public static String dayOfWeek2(int index) {
//
//        return switch (index) {
//            case 1 -> "Thứ Hai";
//
//            case 2 -> "Thứ Ba";
//
//            case 3 -> "Thứ Tư";
//
//            case 4 -> "Thứ Năm";
//
//            case 5 -> "Thứ Sáu";
//
//            case 6 -> "Thứ Bảy";
//
//            case 7 -> "Chử Nhật";
//
//            default -> "Ngày không hợp lệ";
//
//        };
//
//    }
//
//    public static String dayOfWeek(int index) {
//        var res = "";
//        switch (index) {
//            case 1:
//                res = "Thứ Hai";
//                break;
//            case 2:
//                res = "Thứ Ba";
//                break;
//
//            case 3:
//                res = "Thứ Tư";
//                break;
//
//            case 4:
//                res = "Thứ Năm";
//                break;
//
//            case 5:
//                res = "Thứ Sáu";
//                break;
//
//            case 6:
//                res = "Thứ Bảy";
//                break;
//
//            case 7:
//                res = "Chử Nhật";
//                break;
//
//            default:
//                res = "Ngày không hợp lệ";
//                break;
//
//        }
//
//        return res;
//    }
}
