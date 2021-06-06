package com.PatosEnterprise.patosSim;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class UnitTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void duckShouldBeMallard()
    {
        MallardDuck mallard = new MallardDuck();
        assertEquals("I'm a real Mallard duck", mallard.display());
    }
}
