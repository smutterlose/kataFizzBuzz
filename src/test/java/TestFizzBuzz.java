import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class TestFizzBuzz {

    @RunWith(Parameterized.class)
    public static class ParameterizedTest {

        // @formatter:off
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                    {0, "0"},
                    {1, "1"},
                    {2, "2"},
                    {3, "Fizz"},
                    {4, "4"},
                    {5, "Buzz"},
                    {6, "Fizz"},
                    {7, "Whizz"},
                    {10, "Buzz"},
                    {13, "Fizz"},
                    {15, "FizzBuzz"},
                    {17, "Whizz"},
                    {35, "FizzBuzzWhizz"},
                    {30, "FizzBuzz"},
                    {52, "Buzz"},
                    {70, "BuzzWhizz"},
                    {105, "FizzBuzzWhizz"},
                    {133, "FizzWhizz"}
            });
        }
        // @formatter:on

        @Parameterized.Parameter
        public int input;

        @Parameterized.Parameter(1)
        public String expected;

        @Test
        public void testFizzBuzz() {
            String actual = new FizzBuzz().check(input);
            String msg = String.format("Input: %1s, Expected: %2s, Actual: %3s", input, expected, actual);
            Assert.assertEquals(msg, expected, actual);
        }
    }

    public static class SingleTests {

        @Test
        public void testFizzBuzzForNegative1IsIllegal() {
            try {
                new FizzBuzz().check(-1);
                Assert.fail();
            } catch (IllegalArgumentException ignore) {

            }
        }
    }
}
