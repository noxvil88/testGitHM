package Lesson02.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.09.2021
 */

public class ClassNumberTwo {

//    public static int valueClass = 10;

    public static void main(String[] args) {
//        System.out.println(valueClass);
//        int valueMethod = 20;
//        studySwitch();
//        System.out.println(valueMethod);
//        System.out.print("Cat 1 ");
//        System.out.print("Cat 2 ");
//        System.out.print("Cat 3 ");
//        System.out.print("Cat 4 ");
//        System.out.print("Cat 5 ");
//        System.out.print("Cat 6 ");
//        System.out.print("Cat 7 ");
//        System.out.print("Cat 8 ");
//        System.out.print("Cat 9 ");
//        System.out.println("Cat 10");

//        for (int i = 1; i <= 10; i++) { //i = i + 1
//            System.out.print("Cat " + i + " ");
//        }

//        System.out.println("Result: " + myMath(2, -10));

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <= 2; j++) {
//
//            }
//        }
//        printTable(-10,-10);

//        int a = 10;
//
//        while (a < 10) {
//            a++;
//            if (a == 6) continue;
//            if (a == 9) break;
//            System.out.print(a + " ");
//        }
//
//        int b = 10;
//
//        do {
//            b++;
//            System.out.println(b + " ");
//        } while (b < 10);
        System.out.println(example1(438));

    }

    public static int myMath(int value, int sign) {
        if (sign < 0) {
            System.out.println("Invalid sign: " + sign);
            return -1;
        }
        if (sign == 0) {
            return 1;
        }
        int result = value;

        for (int i = 1; i <= sign - 1; i++) {
            result = result * value;
        }

        return result;
    }

    public static void printTable(int height, int width) {

        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }

    public static String example1(int value) {
        if (value < 100 || value > 1000) {
            return "Bad";
        }
        return ((value % 10) + "" + ((value % 100) / 10) + "" + (value / 100));

    }

//    public static void studySwitch() {
//        System.out.println(valueClass);
//        String nameLetter = "Qwerty";
//
//        if (nameLetter == "Olga") {
//            System.out.println("Send letter to Olga");
//        } else if (nameLetter == "Boris") {
//            System.out.println("Send letter to Boris");
//        } else if (nameLetter == "Maria") {
//            System.out.println("Send letter to Maria");
//        } else if (nameLetter == "Alex") {
//            System.out.println("Send letter to Alex");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("***********************");
//
//        switch (nameLetter) {
//            case "Olga":
//                System.out.println("Send letter to Olga");
//                break;
//            case "Boris":
//                System.out.println("Send letter to Boris");
//                break;
//            case "Maria":
//                System.out.println("Send letter to Maria");
//                break;
//            case "Alex":
//                System.out.println("Send letter to Alex");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
//    }

}
