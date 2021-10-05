package Lesson05.online;

import Lesson05.online.Point;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.09.2021
 */

public class Player {
    public static int count = 20;
    private int health; //class field
    private int power;
    private String name;
    //    int x;
//    int y;
    private Point coordinate = new Point();
    private Weapon weapon = new Weapon();

    public Player() {
//        System.out.println("This is constructor");
//        int x = 0;
//        int y = 12;
//        System.out.println(x + y);
//        speak();
        name = "Unknown";
        health = 150;
        coordinate.x = 0;
        coordinate.y = 0;
        speak();
    }

    public Player(String name, int health, int power, int x, int y) {
        this.name = name;
        this.health = health;
        this.power = power;
//        this.x = x;
//        this.y = y;
        coordinate.x = x;
        coordinate.y = y;
    }

    void speak() {
        System.out.println(name + " says Hello");
    }

//    public static void doSomething() {
//        System.out.println("Hello " + name);
//    }

    void moveUp() {
//        y -= 1;
        coordinate.y -= 1;
//        System.out.println(name + " change position to [" + x + ":" + y + "]");
        System.out.println(name + " change position to [" + coordinate.x + ":" + coordinate.y + "]");
    }

    void getDamage(int value) {
        health -= value;
        System.out.println(name + " get damage " + value + ". HP = " + health);
    }

    public class Weapon {
        int power;
        int weight;
        String name;
        float atkSpeed;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName(){
        return name;
    }


}
