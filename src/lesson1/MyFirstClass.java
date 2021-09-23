package Lesson01.online;

// on-line comment

/*
multi
line
comment
 */

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.09.2021
 */

public class MyFirstClass {

    public static void main(String[] args) {
//        System.out.print("Hello Java!");
//        System.out.println("Hello hello!");
//        System.out.print("Hello world!");

        //целые числа
//        byte myByte = 36; //1 byte <-128 .. +127>
//        short myShort = 259;//2 bytes <-32768..+32767>
//        int myInteger = 99000;//4 bytes <-2.1mlrd .. +2.1vlrd> DEFAULT
//        long myLong = 30000000000L; //8 bytes <-2^63..+2^63>
//
//        //числа с точкой
//        float myFloat = 15.95f; // 4 bytes <>.0000000
//        double myDouble = 15.95; //8 bytes <>.00000000000000 DEFAULT
//
//        //char
//        char myChar = 'Q'; // 2 bytes ~ Ascii/UTF-16/32
//
//        //non-primitive type-data
//        String myString = "kjfdhglksfdhjglksjfdhglk jher7t6w89er7t6876  jdfhgkfdjhgksjdfg";
//
//        //boolean
//        boolean myBooleanTrue = true;
//        boolean myBooleanFalse = false;

//        int abc = 20;
//
//        if (abc > 100) {
//            System.out.println("Ok!");
//        } else {
//            System.out.println("Fail!");
//        }
//
//        int cde = 100;
//
//        if (cde > 150) {
//            System.out.println("cde > 150");
//        } else if (cde > 90) {
//            System.out.println("cde > 90");
//        } else {
//            System.out.println("FAIL!");
//        }
//
//        int efg = 500;
//        if (efg > 1000) {
//            System.out.println("OK!!!");
//        }
//
//        System.out.println("Hello");
//
//        int a = 150;
//        int b = 350;
//        int result;
//
//        result = myCalculate(a, b);
//        System.out.println("Result = " + result + " point"); //конкатенация
//        a = a - 1;
//        result = myCalculate(a, b);
//        System.out.println("Result = " + result + " point"); //конкатенация
//        b = b - 1;
//        result = myCalculate(a, b);
//        System.out.println("Result = " + result + " point"); //конкатенация
//        a = a + 1;
//        result = myCalculate(a, b);
//        System.out.println("Result = " + result + " point"); //конкатенация
//
//        System.out.println("Finish");
//
//        myFirstVoidMethod();
//        myFirstVoidMethod();
//        myFirstVoidMethod();

        String name = "Boris";

        System.out.println(welcomeUser(name));
        System.out.println(welcomeUser("Boris"));

        String tmp = welcomeUser("Open");
        System.out.println(tmp);

        System.out.println("Result = " + myCalculate(10,15));
        myCalculate(110,115);
    }

    public static int myCalculate(int valueA, int valueB) {
        return valueA * valueB;
    }

    public static String welcomeUser(String name){
        return "Welcome " + name + " to Java 1 Lessons";
    }

    public static void myFirstVoidMethod() {
        System.out.println("Go to shop");
        System.out.println("Go to home");
        System.out.println("Go to sleep");
    }

}
