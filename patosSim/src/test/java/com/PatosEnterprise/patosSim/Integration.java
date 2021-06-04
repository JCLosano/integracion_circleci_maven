package com.PatosEnterprise.patosSim;

import org.junit.Test;
import static org.junit.Assert.*;

public class Integration {

    @Test
    public void integrationChangeDuckBehavior() {
        Duck mallard = new MallardDuck();
        FlyBehavior fly = new FlyWithWings();
        FlyBehavior noFly = new FlyNoWay();

        assertEquals(fly.getClass(), mallard.getFlyBehavior().getClass());

        mallard.setFlyBehavior(new FlyNoWay());

        assertEquals(noFly.getClass(), mallard.getFlyBehavior().getClass());
    }
}
