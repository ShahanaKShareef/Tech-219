package com.sparta.mg.solid.d;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    public Computer() {
        keyboard = new Keyboard();
        monitor = new Monitor();
    }
}
