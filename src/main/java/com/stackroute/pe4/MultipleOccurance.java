package com.stackroute.pe3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {

    public boolean occurence(String str) {
        Pattern pattern = Pattern.compile("se");

        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher(str);


        while (m.find()) {
            System.out.println("Found at:" + m.start() + "-" + (m.end() - 1));
        }

        if(str.isEmpty()) {
            return false;
        }
        else
            return true;
    }
}
