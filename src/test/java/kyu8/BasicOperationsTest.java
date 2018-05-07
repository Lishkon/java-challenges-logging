package kyu8;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicOperationsTest {
    @Test
    public void addingTest() {
        assertThat(BasicOperations.basicMath("+", 1, 2), is(3));
    }

    @Test
    public void subtractingTest() {
        assertThat(BasicOperations.basicMath("-", 1, 2), is(-1));
    }

    @Test
    public void multiplyingTest() {
        assertThat(BasicOperations.basicMath("*", 1, 2), is(2));
    }

    @Test
    public void dividingTest() {
        assertThat(BasicOperations.basicMath("/", 4, 2), is(2));
    }
}
