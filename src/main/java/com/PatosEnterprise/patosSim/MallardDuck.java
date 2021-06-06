package com.PatosEnterprise.patosSim;

public class MallardDuck extends Duck {

    public MallardDuck() {

        flyBehavior = new FlyWithWings();

    } //hola

    public String display() {
        return("I'm a real Mallard duck");
    }
}
