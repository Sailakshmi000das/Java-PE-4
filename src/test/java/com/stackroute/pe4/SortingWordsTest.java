package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingWordsTest {

    SortingWords sw=new SortingWords();

    @Test
    public void sorting(){
        String s="my first name is sailakshmi and my last name is gullapalli";
        String[] res=sw.sortString(s);
        String[] exp={"and","first","gullapalli","is","is","last","my","my","name","name","sailakshmi"};
        assertArrayEquals(exp,res);
    }

}