package CodingBat.String01Test;

import CodingBat.String01.MakeTags;
import org.junit.Assert;
import org.junit.Test;

public class MakeTagsTest {
    @Test
    public void yayTagTest() {
        MakeTags mt = new MakeTags();
        Assert.assertEquals("<i>Yay</i>", mt.makeTags("i", "Yay"));
    }

    @Test
    public void helloTagTest() {
        MakeTags mt = new MakeTags();
        Assert.assertEquals("<i>Hello</i>", mt.makeTags("i", "Hello"));
    }

    @Test
    public void citeYayTagTest() {
        MakeTags mt = new MakeTags();
        Assert.assertEquals("<cite>Yay</cite>", mt.makeTags("cite", "Yay"));
    }
}
