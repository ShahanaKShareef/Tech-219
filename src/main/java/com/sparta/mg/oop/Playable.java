package com.sparta.mg.oop;

public interface Playable {

    final static int number = 7;
    abstract void play();

    default void grow() {

    }
}
