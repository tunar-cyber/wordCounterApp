package lt.vu.wordcounterapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void TEST_WORDS_SEPARATED_BY_SPACES() {
        Counter counter = new Counter();

        String input = "Hello World Java";

        int result = counter.countWords(input);

        assertEquals(3, result);
    }
    @Test
    public void TEST_EMPTY_STRING_RETURNS_ZERO_WORDS() {
        Counter counter = new Counter();

        String input = "";

        int result = counter.countWords(input);

        assertEquals(0, result);
    }
    @Test
    public void TEST_WORDS_SEPARATED_BY_COMMAS() {
        Counter counter = new Counter();

        String input = "Hello,World,Java";

        int result = counter.countWords(input);

        assertEquals(3, result);
    }

    @Test
    public void TEST_MIXED_SEPARATORS() {
        Counter counter = new Counter();

        String input = "Hello, World.Java";

        int result = counter.countWords(input);

        assertEquals(3, result);
    }
    @Test
    public void TEST_WORDS_SEPARATED_BY_DOTS() {
        Counter counter = new Counter();

        String input = "Hello.World.Java";

        int result = counter.countWords(input);

        assertEquals(3, result);
    }
    @Test
    public void TEST_COUNT_TWO_NUMBERS() {
        Counter counter = new Counter();

        String input = "I have 12 apples and 45 oranges.";

        int result = counter.CountNumbers(input);

        assertEquals(2, result);
    }
    @Test
    public void TEST_CHARACTER_COUNT() {
        Counter counter = new Counter();

        String input = "Hello";

        int result = counter.CountChars(input);

        assertEquals(5, result);
    }
    @Test
    public void TEST_THREE_SENTENCES() {
        Counter counter = new Counter();

        String input = "Hello. Hi! Bye?";

        int result = counter.CountSentences(input);

        assertEquals(3, result);
    }

    @Test
    public void TEST_CHARACTER_COUNT_WITH_SPACES() {
        Counter counter = new Counter();

        String input = "Hello World";

        int result = counter.CountChars(input);

        assertEquals(11, result);
    }
    @Test
    public void TEST_THREE_NUMBERS_IN_TEXT() {
        Counter counter = new Counter();

        String input = "I have 12 apples, 45 oranges and 100 bananas.";

        int result = counter.CountNumbers(input);

        assertEquals(3, result);
    }
}

