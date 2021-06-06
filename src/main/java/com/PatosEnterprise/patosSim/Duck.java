package com.PatosEnterprise.patosSim;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public FlyBehavior getFlyBehavior() { return flyBehavior;}

    abstract String display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
