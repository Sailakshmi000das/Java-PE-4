package com.stackroute.pe3;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class PatternMatchingTest {

    PatternMatching pm = new PatternMatching();

    @Test
    public void matching() {
        String s = "This is Harry";
        boolean res = pm.pattern(s);
        assertEquals(true, res);
    }

    @Test
    public void matchingFailure() {
        String s = "This is Henry";
        boolean res = pm.pattern(s);
        assertEquals(false, res);
    }
}
