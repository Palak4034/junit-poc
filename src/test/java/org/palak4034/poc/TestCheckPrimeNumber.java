package org.palak4034.poc;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith (Theories.class)
public class TestCheckPrimeNumber
{
    @DataPoints("testPrimes")
    public static int[] primes = {29, 7, 11, 5, 19, 23, 31, 41};
    
    @DataPoints("testNotPrimes")
    public static int[] notPrimes = {4, 27, 32, 15, 68, 21, 39};
    
    @DataPoints("testFalsePositives")
    public static int[] falsePositives = {27, 39, 69, 81};
    
    @DataPoints("testFalseNegatives")
    public static int[] falseNegatives = { 59, 19};
    
    //Special cases: 2, 3, 77
    
    @Theory
    public void theoryTestPrimes(@FromDataPoints("testPrimes") int input)
    {
        assertNotEquals(true, input<1);
        assertTrue(CheckPrimeNumber.isPrimeNumber(input));
        //assertTrue(CheckPrimeNumber.isPrimeNumber(falseNegatives));
    }
    
    @Theory
    public void theoryTestFalseNegatives(@FromDataPoints("testFalseNegatives") int falseNegatives)
    {
        assertNotEquals(true, falseNegatives<1);
        //assertTrue(CheckPrimeNumber.isPrimeNumber(input));
        assertTrue(CheckPrimeNumber.isPrimeNumber(falseNegatives));
    }
    
    @Theory
    public void theoryTestNotPrimes(@FromDataPoints("testNotPrimes") int input, @FromDataPoints("testFalsePositives") int falsePositives)
    {
        assertNotEquals(true, input<1);
        assertFalse(CheckPrimeNumber.isPrimeNumber(input));
        //assertFalse(CheckPrimeNumber.isPrimeNumber(falsePositives));
    }
    
    @Theory
    public void theoryTestFalsePositives(@FromDataPoints("testFalsePositives") int falsePositives)
    {
        assertNotEquals(true, falsePositives <1);
        //assertFalse(CheckPrimeNumber.isPrimeNumber(input));
        assertFalse(CheckPrimeNumber.isPrimeNumber(falsePositives));
    }
}
