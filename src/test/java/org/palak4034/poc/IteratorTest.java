package org.palak4034.poc;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;


public class IteratorTest {

    private List<String> list;          // test fixture
    private Iterator<String> itr;       // test fixture

    @Before
    public void setUp()         // set up test fixture
    {
        list = new ArrayList<String>();
        list.add ("cat");
        list.add ("dog");
        itr = list.iterator();
    }

    // C1=T; C2=T; C3=T; C4=T
    @Test
    public void test_BaseCase()
    {
        assertTrue(itr.hasNext());
        assertEquals("cat",itr.next());
        itr.remove();
        assertFalse(list.contains("cat"));
    }


    //C1-T, C2-F, C3-T, C4-T
    @Test
    public void testRemove_C2()
    {
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add (null);
        itr = list2.iterator();
        assertNull (itr.next());
    }

    //C1-T, C2-T, C3-F, C4-T
    @Test(expected=UnsupportedOperationException.class)
    public void testRemove_C3()
    {
        list = Collections.unmodifiableList (list);
        itr = list.iterator();
        itr.remove();
    }

    //C1-T, C2-T, C3-T, C4-F
    @Test(expected=IllegalStateException.class)
    public void testRemove_C4()
    {
        itr.remove();
    }
}
