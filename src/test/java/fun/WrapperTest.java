package fun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapperTest {
    @Test
    public void testWrapWithColumnSmallerThanWord() {
        assertEquals("wo\nrd", Wrapper.wrap("word", 2));
    }
}
