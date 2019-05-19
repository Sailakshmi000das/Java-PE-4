package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    Transpose t=new Transpose();

    @Test
    public void transpose(){
        String s="a quick brown fox jumps over the lazy dog";
        String res=t.transposeString(s);
        String exp="a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(exp,res);
    }

}