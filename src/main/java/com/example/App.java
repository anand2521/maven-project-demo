package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Maven Project Demo Application
 */
public class App {
    
    private static final String VERSION = "1.0.0";
    
    public static void main(String[] args) {
        System.out.println("🚀 Welcome to Maven Project Demo!");
        System.out.println("=" + "=".repeat(50));
        
        App app = new App();
        
        // Display application info
        System.out.println(app.getApplicationInfo());
        System.out.println();
        
        // Demo functionality
        app.demonstrateFunctionality();
        
        System.out.println();
        System.out.println("✅ Application completed successfully!");
    }
    
    public String getApplicationInfo() {
        StringBuilder info = new StringBuilder();
        info.append("📦 Application: Maven Project Demo\n");
        info.append("🔢 Version: ").append(VERSION).append("\n");
        info.append("📅 Current Time: ").append(getCurrentTime()).append("\n");
        info.append("☕ Java Version: ").append(System.getProperty("java.version")).append("\n");
        info.append("🎯 Purpose: Demonstrating GitHub Actions with Maven");
        return info.toString();
    }
    
    public void demonstrateFunctionality() {
        System.out.println("🧮 Mathematical Operations:");
        System.out.println("  Addition: 15 + 25 = " + add(15, 25));
        System.out.println("  Multiplication: 7 × 8 = " + multiply(7, 8));
        
        System.out.println();
        System.out.println("🔍 Utility Functions:");
        System.out.println("  Is 42 even? " + isEven(42));
        System.out.println("  Factorial of 5: " + factorial(5));
        
        System.out.println();
        System.out.println("📝 String Operations:");
        System.out.println("  Reversed 'GitHub': " + reverseString("GitHub"));
        System.out.println("  'level' palindrome? " + isPalindrome("level"));
    }
    
    // Mathematical operations
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Utility functions
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    // String operations
    public String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
    
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(reverseString(cleaned));
    }
    
    // Utility methods
    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    
    public String getVersion() {
        return VERSION;
    }
}
