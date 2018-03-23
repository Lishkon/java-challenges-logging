package kyu8;

import org.junit.Test;

import static java.lang.Long.valueOf;
import static kyu8.PaperFolder.fold;
import static org.junit.Assert.assertEquals;

public class PaperFolderTest {
    @Test
    public void sampleTests() {
        assertEquals(java.util.Optional.of(valueOf(42L)), fold(new Double(384000000)));
        assertEquals(java.util.Optional.of(valueOf(0L)), fold(new Double(0.00005)));
    }
}