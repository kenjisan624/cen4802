/*
Module 3 Assignment || JUnit Test cases
Course: Software Int. Config. and Testing - CEN 4802
Instructor: Ian O'Toole
Name: Kenji Nakanishi
Date: 2/01/2026

*/

package com.example;

public class StringTest {
        public static boolean isEmpty(String testContent) {
            return testContent == null || testContent.isEmpty();
        }

        public static String reverse(String testContent) {
            if (testContent == null) {
                return null;
            }
            return new StringBuilder(testContent).reverse().toString();
            // return testContent;
        }
}