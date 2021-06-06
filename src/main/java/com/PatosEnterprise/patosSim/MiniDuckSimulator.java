package com.PatosEnterprise.patosSim;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck	mallard = new MallardDuck();
        Duck	 model = new ModelDuck();

        mallard.performFly();

        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();

    }
}