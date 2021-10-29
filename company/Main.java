package com.company;

public class Main {
    public static void main(String[] args) {
        Fish f = new Fish();
        Cow c = new Cow();
        System.out.println("Fish info:");
        f.say();
        f.canSwim();
        f.canFly();
        f.canRun();
        System.out.println("Cow info:");
        c.say();
        c.canSwim();
        c.canFly();
        c.canRun();
    }
}