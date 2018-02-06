package org.palak4034.poc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestSumSquares
{
    @Test
    public void testSumSquares_1()
    {
        int output = SumSquares.sumSquares(2, 3);
        assertEquals(13, output);
    }
    
    @Test
    public void testSumSquares_2()
    {
        int output = SumSquares.sumSquares(0, -4);
        assertEquals(0, output);
    }

}
