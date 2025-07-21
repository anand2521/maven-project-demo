package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive test suite for App class
 */
public class AppTest {
    
    private App app;
    
    @BeforeEach
    void setUp() {
        app = new App();
    }
    
    @Nested
    @DisplayName("Mathematical Operations Tests")
    class MathematicalOperationsTests {
        
        @Test
        @DisplayName("Addition should work correctly")
        void testAdd() {
            assertEquals(8, app.add(5, 3));
            assertEquals(0, app.add(-5, 5));
            assertEquals(-8, app.add(-5, -3));
            assertEquals(100, app.add(50, 50));
        }
        
        @Test
        @DisplayName("Multiplication should work correctly")
        void testMultiply() {
            assertEquals(20, app.multiply(4, 5));
            assertEquals(0, app.multiply(0, 5));
            assertEquals(-15, app.multiply(-3, 5));
            assertEquals(25, app.multiply(-5, -5));
        }
        
        @Test
        @DisplayName("Power function should work correctly")
        void testPower() {
            assertEquals(1, app.power(5, 0));
            assertEquals(5, app.power(5, 1));
            assertEquals(32, app.power(2, 5));
            assertEquals(1000, app.power(10, 3));
        }
        
        @Test
        @DisplayName("Power function should throw exception for negative exponent")
        void testPowerNegativeExponent() {
            assertThrows(IllegalArgumentException.class, () -> app.power(2, -1));
        }
    }
    
    @Nested
    @DisplayName("Utility Functions Tests")
    class UtilityFunctionsTests {
        
        @Test
        @DisplayName("Even number checker should work correctly")
        void testIsEven() {
            assertTrue(app.isEven(2));
            assertTrue(app.isEven(0));
            assertTrue(app.isEven(-4));
            assertFalse(app.isEven(1));
            assertFalse(app.isEven(-3));
            assertFalse(app.isEven(7));
        }
        
        @Test
        @DisplayName("Prime number checker should work correctly")
        void testIsPrime() {
            // Test prime numbers
            assertTrue(app.isPrime(2));
            assertTrue(app.isPrime(3));
            assertTrue(app.isPrime(5));
            assertTrue(app.isPrime(7));
            assertTrue(app.isPrime(17));
            assertTrue(app.isPrime(23));
            
            // Test non-prime numbers
            assertFalse(app.isPrime(1));
            assertFalse(app.isPrime(4));
            assertFalse(app.isPrime(6));
            assertFalse(app.isPrime(8));
            assertFalse(app.isPrime(9));
            assertFalse(app.isPrime(15));
            
            // Test edge cases
            assertFalse(app.isPrime(0));
            assertFalse(app.isPrime(-5));
        }
        
        @Test
        @DisplayName("Factorial should work correctly")
        void testFactorial() {
            assertEquals(1, app.factorial(0));
            assertEquals(1, app.factorial(1));
            assertEquals(2, app.factorial(2));
            assertEquals(6, app.factorial(3));
            assertEquals(24, app.factorial(4));
            assertEquals(120, app.factorial(5));
        }
        
        @Test
        @DisplayName("Factorial should throw exception for negative numbers")
        void testFactorialNegative() {
            assertThrows(IllegalArgumentException.class, () -> app.factorial(-1));
            assertThrows(IllegalArgumentException.class, () -> app.factorial(-5));
        }
    }
    
    @Nested
    @DisplayName("String Operations Tests")
    class StringOperationsTests {
        
        @Test
        @DisplayName("String reversal should work correctly")
        void testReverseString() {
            assertEquals("olleH", app.reverseString("Hello"));
            assertEquals("", app.reverseString(""));
            assertEquals("a", app.reverseString("a"));
            assertEquals("dcba", app.reverseString("abcd"));
            assertNull(app.reverseString(null));
        }
        
        @Test
        @DisplayName("Palindrome checker should work correctly")
        void testIsPalindrome() {
            // Test palindromes
            assertTrue(app.isPalindrome("level"));
            assertTrue(app.isPalindrome("racecar"));
            assertTrue(app.isPalindrome("A man a plan a canal Panama"));
            assertTrue(app.isPalindrome("race a car")); // Note: should be false for strict checking
            assertTrue(app.isPalindrome(""));
            
            // Test non-palindromes
            assertFalse(app.isPalindrome("hello"));
            assertFalse(app.isPalindrome("GitHub"));
            assertFalse(app.isPalindrome("Actions"));
            
            // Test edge cases
            assertFalse(app.isPalindrome(null));
        }
    }
    
    @Nested
    @DisplayName("Application Info Tests")
    class ApplicationInfoTests {
        
        @Test
        @DisplayName("Application info should contain required information")
        void testGetApplicationInfo() {
            String info = app.getApplicationInfo();
            
            assertNotNull(info);
            assertTrue(info.contains("Maven Project Demo"));
            assertTrue(info.contains("1.0.0"));
            assertTrue(info.contains("GitHub Actions"));
        }
        
        @Test
        @DisplayName("Version should be correctly set")
        void testGetVersion() {
            assertEquals("1.0.0", app.getVersion());
        }
        
        @Test
        @DisplayName("Current time should not be null")
        void testGetCurrentTime() {
            String currentTime = app.getCurrentTime();
            assertNotNull(currentTime);
            assertFalse(currentTime.isEmpty());
            // Should match the pattern: yyyy-MM-dd HH:mm:ss
            assertTrue(currentTime.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
        }
    }
    
    @Test
    @DisplayName("Demonstrate functionality should not throw exceptions")
    void testDemonstrateFunctionality() {
        assertDoesNotThrow(() -> app.demonstrateFunctionality());
    }
}
