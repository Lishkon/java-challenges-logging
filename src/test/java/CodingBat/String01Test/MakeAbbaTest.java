package CodingBat.String01Test;

import CodingBat.String01.MakeAbba;
import org.junit.Assert;
import org.junit.Test;

public class MakeAbbaTest {
    @Test
    public void hiByeByeHiTest() {
        MakeAbba ma = new MakeAbba();
        Assert.assertEquals("HiByeByeHi", ma.makeAbba("Hi", "Bye"));
    }

    @Test
    public void yoAliceAliceYoTest() {
        MakeAbba ma = new MakeAbba();
        Assert.assertEquals("YoAliceAliceYo", ma.makeAbba("Yo", "Alice"));
    }

    @Test
    public void whatUpUpWhatTest() {
        MakeAbba ma = new MakeAbba();
        Assert.assertEquals("WhatUpUpWhat", ma.makeAbba("What", "Up"));
    }
}
