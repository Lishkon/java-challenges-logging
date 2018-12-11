package Codewars.kyu5;

import org.junit.Assert;
import org.junit.Test;

public class SimplePigLatinTest {

    @Test
    public void helloWorldTest() {
        SimplePigLatin spl = new SimplePigLatin();
        Assert.assertEquals("elloHay orldway !", spl.simplePigLatin("Hello world !"));
    }

    @Test
    public void hiThereTest() {
        SimplePigLatin spl = new SimplePigLatin();
        Assert.assertEquals("ihay heretay!", spl.simplePigLatin("Hi there!"));
    }

    @Test
    public void pigLatinIsCoolTest() {
        SimplePigLatin spl = new SimplePigLatin();
        Assert.assertEquals("igPay atinlay siay oolcay", spl.simplePigLatin("Pig latin is cool"));
    }

    @Test
    public void simplePigifyTest() {
        Assert.assertEquals("lexaay", SimplePigLatin.pigify("alex"));
    }

    @Test
    public void singleCharPigifyTest() {
        Assert.assertEquals("Iay", SimplePigLatin.pigify("I"));
    }

    @Test
    public void twoCharsPigifyTest() {
        Assert.assertEquals("sIay", SimplePigLatin.pigify("Is"));
    }

    @Test
    public void punctuatedTest() {
        Assert.assertEquals("Iay!", SimplePigLatin.pigify("I!"));
    }

    @Test
    public void punctuated2Test() {
        Assert.assertEquals("amIay!", SimplePigLatin.pigify("Iam!"));
    }

    @Test
    public void emptyTest() {
        Assert.assertEquals("", SimplePigLatin.pigify(""));
    }
}
