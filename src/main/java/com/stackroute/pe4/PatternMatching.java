package com.stackroute.pe3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

    public boolean pattern(String str) {
        String s="Harry";
        String pattern = ".*Harry";
        System.out.println("Is "+s+" here ? "+str.matches(pattern));
        return str.matches(pattern);
    }
}