//8.1 UnitTesting Task 2.


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private final StringManipulator manipulator = new StringManipulator();

    @Test
    void testConcatenate() {
        assertEquals("hello world", manipulator.concatenate("hello ", "world"));
        assertEquals("foo", manipulator.concatenate("foo", ""));
        assertEquals("bar", manipulator.concatenate("", "bar"));
        assertEquals("", manipulator.concatenate("", ""));
        assertEquals("nullstr", manipulator.concatenate(null, "str"));
        assertEquals("strnull", manipulator.concatenate("str", null));
        assertEquals("nullnull", manipulator.concatenate(null, null));
    }

    @Test
    void testFindLength() {
        assertEquals(5, manipulator.findLength("hello"));
        assertEquals(0, manipulator.findLength(""));
        assertEquals(0, manipulator.findLength(null));
        assertEquals(4, manipulator.findLength("test"));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("HELLO", manipulator.convertToUpperCase("hello"));
        assertEquals("JAVA", manipulator.convertToUpperCase("Java"));
        assertEquals("", manipulator.convertToUpperCase(""));
        assertNull(manipulator.convertToUpperCase(null));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("hello", manipulator.convertToLowerCase("HELLO"));
        assertEquals("java", manipulator.convertToLowerCase("Java"));
        assertEquals("", manipulator.convertToLowerCase(""));
        assertNull(manipulator.convertToLowerCase(null));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("hello world", "world"));
        assertTrue(manipulator.containsSubstring("java", "a"));
        assertFalse(manipulator.containsSubstring("test", "x"));
        assertFalse(manipulator.containsSubstring("foo", ""));
        assertFalse(manipulator.containsSubstring("", "bar"));
        assertFalse(manipulator.containsSubstring(null, "bar"));
        assertFalse(manipulator.containsSubstring("foo", null));
        assertFalse(manipulator.containsSubstring(null,null));
}
}
