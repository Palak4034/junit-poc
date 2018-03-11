package org.palak4034.poc;

import java.util.BitSet;
import static junit.framework.TestCase.*;

import org.junit.Test;

public class BitSetTest
{
    static BitSet negativeBitSet;
    static BitSet bitSet = new BitSet(5);
    
    @Test(expected = NegativeArraySizeException.class)
    public void testCreateBitSetSize()
    {
        assertNull(negativeBitSet);
        
        negativeBitSet = new BitSet(5);
        assertNotNull(negativeBitSet);
        
        negativeBitSet.set(0, true);
        negativeBitSet.set(4, true);
        
        assertEquals(5, negativeBitSet.length());
        
        for(int i = 0; i < 5; i++)
        {
            if(i == 0 || i == 4)
                assertTrue(negativeBitSet.get(i));
            else
                assertFalse(negativeBitSet.get(i));
        }
        negativeBitSet = new BitSet(-4);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testBitSet_set() {
        for(int i = 0; i < 5; i++)
            assertEquals(false, bitSet.get(i));
        
        bitSet.set(3);
        assertTrue(bitSet.get(3));
        bitSet.set(-10);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testBitSet_get()
    {
        assertFalse(bitSet.get(2));
        
        bitSet.set(2);
        assertTrue(bitSet.get(2));
        bitSet.set(2, false);
        
        bitSet.get(-2);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testBitSet_flip()
    {
        assertFalse(bitSet.get(3));
        bitSet.flip(3);
        assertTrue(bitSet.get(3));
        bitSet.flip(3);
        
        bitSet.get(-1);
    }
    
}
