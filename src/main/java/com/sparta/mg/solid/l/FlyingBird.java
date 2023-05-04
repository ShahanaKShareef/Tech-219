package com.sparta.mg.solid.l;

public class FlyingBird extends Bird{

    public FlyingBird(String name) {
        super(name);
    }

    public String fly() {
        return super.getName() + " takes to the skies!";
    }
}
