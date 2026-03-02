package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTestCases {

    @Test
    void Case_is_empty() {
        assertTrue(StringTest.isEmpty(""));
        assertTrue(StringTest.isEmpty(null));
    }

    @Test
    void Case_is_not_empty(){
        assertFalse(StringTest.isEmpty("Hello World"));
    }

    @Test
    void Case_reversed(){
        assertEquals("olleH", StringTest.reverse("Hello"));
    }
}
