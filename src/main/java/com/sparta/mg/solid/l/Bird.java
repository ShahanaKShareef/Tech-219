package com.sparta.mg.solid.l;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String fly() {
       return name + " takes to the skies!";
    }
}
