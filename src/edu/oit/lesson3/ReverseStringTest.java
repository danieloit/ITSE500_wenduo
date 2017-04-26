package edu.oit.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void test() {
        assertEquals(ReverseString.reverseString("HelloWorld"),"dlroWolleH");
        assertEquals(ReverseString.reverseString("April 4th, 1983"),"3891 ,ht4 lirpA");
        assertEquals(ReverseString.reverseString("code$&*/"),"/*&$edoc");
        
        
    }

}
