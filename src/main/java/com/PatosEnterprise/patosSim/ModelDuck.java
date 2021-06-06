package com.PatosEnterprise.patosSim;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
    }

    public String display() {
        return("I'm a model duck");
    }
}
