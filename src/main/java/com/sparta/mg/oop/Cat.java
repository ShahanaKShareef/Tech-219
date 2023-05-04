package com.sparta.mg.oop;

public class Cat extends Animal {
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void speak() {
        System.out.println("Cat's don't speak!");
    }

    @Override
    void sleep() {

    }
}
