package com.company;

public class Fish implements Animal{

    @Override
    public void say() {
        System.out.println("Bool-bool!");
    }

    @Override
    public void canSwim() {
        System.out.println("YES");
    }

    @Override
    public void canRun() {
        System.out.println("NO");
    }

    @Override
    public void canFly() {
        System.out.println("NO");
    }
}
