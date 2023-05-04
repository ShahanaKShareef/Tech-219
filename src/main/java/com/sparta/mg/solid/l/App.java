package com.sparta.mg.solid.l;

public class App {
    public static void main(String[] args) {
        Bird eagle = new Eagle("Eagle");
        Bird falcon = new Falcon("Falcon");
        Bird ostrich = new Ostrich("Falcon");
        Bird[] birds = {eagle, falcon};

        for (Bird bird : birds) {
            System.out.println(bird.fly());
        }
    }
}
