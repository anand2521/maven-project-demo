package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for App class
 */
public class AppTest {
    
    private App app;
    
    @BeforeEach
    void setUp() {
        app = new App();
    }
    
    @Test
    @DisplayName("Addition should work correctly")
    public void testAdd() {
        assertEquals(8, app.add(5, 3));
        assertEquals(0, app.add(-5, 5));
        assertEquals(-8, app.add(-5, -3));
        assertEquals(100, app.add(50, 50));
    }
    
    @Test
    @DisplayName("Multiplication should work correctly")
    public void testMultiply() {
        assertEquals(20, app.multiply(4, 5));
        assertEquals(0, app.multiply(0, 5));
        assertEquals(-15, app.multiply(-3, 5));
        assertEquals(25, app.multiply(-5, -5));
    }
    
    @Test
    @DisplayName("Even number checker should work correctly")
    public void testIsEven() {
        assertTrue(app.isEven(2));
        assertTrue(app.isEven(0));
        assertTrue(app.isEven(-4));
        assertFalse(app.isEven(1));
        assertFalse(app.isEven(-3));
        assertFalse(app.isEven(7));
    }
    
    @Test
    @DisplayName("Factorial should work correctly")
    public void testFactorial() {
        assertEquals(1, app.factorial(0));
        assertEquals(1, app.factorial(1));
        assertEquals(2, app.factorial(2));
        assertEquals(6, app.factorial(3));
        assertEquals(24, app.factorial(4));
        assertEquals(120, app.factorial(5));
    }
    
    @Test
    @DisplayName("Factorial should throw exception for negative numbers")
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> app.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> app.factorial(-5));
    }
    
    @Test
    @DisplayName("String reversal should work correctly")
    public void testReverseString() {
        assertEquals("olleH", app.reverseString("Hello"));
        assertEquals("", app.reverseString(""));
        assertEquals("a", app.reverseString("a"));
        assertEquals("dcba", app.reverseString("abcd"));
        assertNull(app.reverseString(null));
    }
    
    @Test
    @DisplayName("Palindrome checker should work correctly")
    public void testIsPalindrome() {
        // Test palindromes
        assertTrue(app.isPalindrome("level"));
        assertTrue(app.isPalindrome("racecar"));
        assertTrue(app.isPalindrome(""));
        
        // Test non-palindromes
        assertFalse(app.isPalindrome("hello"));
        assertFalse(app.isPalindrome("GitHub"));
        assertFalse(app.isPalindrome("Actions"));
        
        // Test edge cases
        assertFalse(app.isPalindrome(null));
    }
    
    @Test
    @DisplayName("Application info should contain required information")
    public void testGetApplicationInfo() {
        String info = app.getApplicationInfo();
        
        assertNotNull(info);
        assertTrue(info.contains("Maven Project Demo"));
        assertTrue(info.contains("1.0.0"));
        assertTrue(info.contains("GitHub Actions"));
    }
    
    @Test
    @DisplayName("Version should be correctly set")
    public void testGetVersion() {
        assertEquals("1.0.0", app.getVersion());
    }
    
    @Test
    @DisplayName("Current time should not be null")
    public void testGetCurrentTime() {
        String currentTime = app.getCurrentTime();
        assertNotNull(currentTime);
        assertFalse(currentTime.isEmpty());
        // Should match the pattern: yyyy-MM-dd HH:mm:ss
        assertTrue(currentTime.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
    }
    
    @Test
    @DisplayName("Demonstrate functionality should not throw exceptions")
    public void testDemonstrateFunctionality() {
        assertDoesNotThrow(() -> app.demonstrateFunctionality());
    }
}
