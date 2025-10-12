
import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest {

    @Test
    public void testSimplePalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("radar"));
    }

    @Test
    public void testPhrasePalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
    }

    @Test
    public void testNonPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
    }

    @Test
    public void testPalindromeWithNumbersAndSpaces() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("1 2 3 2 1"));
    }

    @Test
    public void testEmptyString() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome(""));
    }
}
