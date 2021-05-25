package main.coderbyte.palindrome;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeCheckerTest {
    @Test
    public void shouldBePalindromeWhenRemovingOneCharacter() {
        assertEquals("palindrome", PalindromeChecker.checkIfPalindrome("abcdcba"));
        assertEquals("palindrome", PalindromeChecker.checkIfPalindrome("abdcba"));
        assertEquals("not palindrome", PalindromeChecker.checkIfPalindrome("asdfgh"));
    }

    @Test
    public void shouldBePalindromeWhenRemovingTwoCharacters() {
        assertEquals("palindrome", PalindromeChecker.checkIfPalindrome("abcdjcba"));
    }

    @Test
    public void shouldReturnExceptionWhenPassingNull() {
        assertEquals(" ", PalindromeChecker.checkIfPalindrome(null));
    }
}