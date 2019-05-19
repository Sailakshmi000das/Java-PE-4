package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceTest {

    MultipleOccurance mo=new MultipleOccurance();

    @Test
    public void multiple(){
        String s="She sells seashells by the seashore";
        boolean res=mo.occurence(s);
        assertEquals(true,res);
    }

    @Test
    public void multipleFailure(){
        String s="";

        boolean res=mo.occurence(s);
        assertEquals(false,res);
    }

}