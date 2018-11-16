package kyu8.WarmupTest;

import kyu8.Warmup01.StartOz;
import org.junit.Assert;
import org.junit.Test;

public class StartOzTest {
    StartOz st = new StartOz();
    @Test
    public void oxxTest() {
        Assert.assertEquals("o", st.startOz("oxx"));
    }

    @Test
    public void bzooTest() {
        Assert.assertEquals("z", st.startOz("bzoo"));
    }

    @Test
    public void ozTest() {
        Assert.assertEquals("oz", st.startOz("ozymandias"));
    }
}
