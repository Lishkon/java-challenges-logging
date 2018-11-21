package Codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Long.valueOf;
import static org.junit.Assert.assertEquals;

public class PaperFolderTest {
    @Test
    public void sampleTests() {
        Assert.assertEquals(java.util.Optional.of(valueOf(42L)), PaperFolder.fold(new Double(384000000)));
        Assert.assertEquals(java.util.Optional.of(valueOf(0L)), PaperFolder.fold(new Double(0.00005)));
    }
}