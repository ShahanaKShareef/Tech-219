package com.sparta.mg.oop;

public class Dog extends Animal implements Playable{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void sleep() {

    }

    public void speak(String owner) {
        System.out.println(getName() + " is speaking to " + owner);
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}