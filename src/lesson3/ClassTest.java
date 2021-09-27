package Lesson03.online;

import javax.xml.crypto.Data;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 22.09.2021
 */

public class ClassTest {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        System.out.println("Result random user numbers: " +
//                randomValue(inputUserNumber("Enter value1"),
//                        inputUserNumber("Enter value2")));
//        System.out.println("Result random user numbers: " + random.nextInt(0));

//        System.out.println("Hello " + inputUserName("Enter your name"));
//        System.out.println("Phone " + inputUserName("Enter your phone"));

//        int abc = 150;
//        System.out.println("Result > " + abc * inputUserNumber("Enter your number"));

//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt() + " | "); //[-int;+int]
//            System.out.print(random.nextInt(20) + " | "); //[0;value)
//            System.out.print(random.nextFloat() + " | "); //[0;1)
//            System.out.print(random.nextDouble() + " | "); //[0;1)
//            System.out.print(randomValue(-20, -10));
//        }
//        welcomeUser();
//        welcomeUser("Boris");
//        welcomeUser("Boris", "Qwerty");

//        int[] myArrayInteger = new int[5];
//        myArrayInteger[0] = 15;
//        myArrayInteger[1] = 20;
//        myArrayInteger[2] = 30;
//        myArrayInteger[3] = 40;
//        myArrayInteger[4] = 50;
//
//        System.out.println(myArrayInteger[2] + myArrayInteger[4]);
//
//        String[] myStringArray = new String[80];
//
//        for (int i = 0; i < myStringArray.length; i++) {
//            myStringArray[i] = "String " + i;
//        }

        //i++ -> i = i + 1

//        for (int i = 0; i < myStringArray.length; i++) {
//            System.out.println(myStringArray[i]);
//        }

//        int[] test1 = new int[10];
//        int[] test2 = new int[110];
//        int[] test3 = new int[1110];
//
//        recordDataInArray(test1);
//        printArray(test1);

//        int[][] myArray2 = new int[5][4];
//        myArray2[2][2] = 16;
        studyArray2(1,5);

    }

    public static void studyArray2(int height, int width) {
        String[][] table = new String[height][width];

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                table[y][x] = "[" + y + ";" + x + "]";
            }
        }

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                System.out.print(table[y][x] + "\t");
            }
            System.out.println();
        }


    }

    public static void recordDataInArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = randomValue(-20, 20);
        }
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
    }

    public static void printArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
    }

//    public static void welcomeUser() {
//        System.out.println("welcome user");
//    }
//
//    public static void welcomeUser(String name) {
//        System.out.println("welcome " + name);
//    }
//
//    public static void welcomeUser(String name, String surname) {
//        System.out.println("welcome " + name + " " + surname);
//    }

    public static int randomValue(int value1, int value2) {
        if (value2 > value1) {
            int tmp = value2 - value1;
            return value1 + random.nextInt(tmp + 1);
        } else {
            System.out.println("Sorry");
            return -1;
        }
    }

    //    public static String inputUserName(String msg){
//        System.out.print(msg + " > ");
//        return scanner.next();
//    }
//
//    public static int inputUserNumber(String msg) {
//        System.out.print(msg + " > ");
//        return scanner.nextInt();
//    }

}
