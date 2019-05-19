package com.stackroute.pe3;

public class Transpose {

    public String transposeString(String str) {
        String[] s = str.split(" ");
        String s1 = "";

        for (int i = 0; i < s.length; i++) {

            s1 = s1 + new StringBuilder(s[i]).reverse().toString()+" ";

        }
        String s2=s1.trim();

        return s2;
    }
}

