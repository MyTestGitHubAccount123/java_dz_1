package com.company;

public class Cow implements Animal{

    @Override
    public void say() {
        System.out.println("Moo!");
    }

    @Override
    public void canSwim() {
        System.out.println("NO");
    }

    @Override
    public void canRun() {
        System.out.println("YES");
    }

    @Override
    public void canFly() {
        System.out.println("NO");
    }
}
