package fun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapperTest {
    @Test
    public void testEmptyString() {
        assertEquals("", Wrapper.wrap("", 1));
    }

    @Test
    public void testWrapWithColumnSmallerThanWord() {
        assertEquals("wo\nrd", Wrapper.wrap("word", 2));
        assertEquals("kit\nten", Wrapper.wrap("kitten", 3));
    }

    @Test
    public void testWrapLongWordIntoManyRows() {
        assertEquals("abc\ndef\nghi\nj", Wrapper.wrap("abcdefghij", 3));
    }

    @Test
    public void testWordBoundary() {
        assertEquals("word\nword", Wrapper.wrap("word word", 5));
    }
}
