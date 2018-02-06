package org.palak4034.poc;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith (Theories.class)
public class TestFinder
{
    @DataPoints("testNeedles")
    public static int[] needles = {3};

    @DataPoints("testHaystacks")
    public static int[][] haystacks = {{3,2,3,4},{4,3,3,20,20,1},{3,10,2,3,10}};
    
    
    @Theory
    public void testMultipleOccuringElement(@FromDataPoints("testHaystacks") int[] haystack, 
        @FromDataPoints("testNeedles") int needle)
    {
        assumeTrue (haystack != null);              // Assume
        assumeTrue (haystack.length > 0);           // Assume
        System.out.println ("Array : " + haystack + ", " + needle);
        
        int firstOccurance = Finder.firstElement(haystack, needle);
        haystack[firstOccurance]=-33;
        
        int secondOccurance = Finder.firstElement(haystack, needle);
        //assertNotEquals(firstOccurance, secondOccurance);
        assertNotEquals(secondOccurance, -1);
    }

}
