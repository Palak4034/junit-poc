package org.palak4034.poc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

/**
 * Created by palak4034 on 3/10/18.
 */
@RunWith(JUnit4.class)
public class DuPathTest {

    @Test
    public void testLcs() {
        String x = "Palak4034";
        String y = "Palak_M";
        String lcs = PrimePathAssignment.lcs(x, y);
        //System.out.println("LCS is : " + lcs);
        assertNotNull(lcs);
        assertEquals(lcs, "Palak");
    }

    @Test
    public void testDuPath_1n12() {
        String lcs = PrimePathAssignment.lcs("", "StringY");
        //System.out.println("LCS is : " + lcs);
        assertEquals("", lcs);
    }
    @Test
    public void testDuPath_2n3n7() {
        String lcs = PrimePathAssignment.lcs("StringX", "");
        //System.out.println("LCS is : " + lcs);
        assertEquals("", lcs);
    }

    @Test
    public void testDuPath_4n6n8n10() {
        String lcs = PrimePathAssignment.lcs("OneX", "TwoX");
        //System.out.println("LCS is : " + lcs);
        assertEquals("X", lcs);
    }

    @Test
    public void testDuPath_5n6n9n11() {
        String lcs = PrimePathAssignment.lcs("OneX", "TwoY");
        //System.out.println("LCS is : " + lcs);
        assertEquals("", lcs);
    }

    @Test
    public void testDuPath_13n14() {
        String lcs = PrimePathAssignment.lcs("StringOne", "StringTwo");
        //System.out.println("LCS is : " + lcs);
        assertEquals("String", lcs);
    }

    @Test
    public void testDuPath_15() {
        String lcs = PrimePathAssignment.lcs("x", "yx");
        //System.out.println("LCS is : " + lcs);
        assertEquals("x", lcs);
    }

    @Test
    public void testDuPath_misc() {
        String lcs = PrimePathAssignment.lcs("xyz", "xpq");
        //System.out.println("LCS is : " + lcs);
        assertEquals("x", lcs);
    }
}
