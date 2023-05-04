package com.sparta.mg.solid.l;

public abstract class FlyingBird {
    private String name;

    public FlyingBird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
