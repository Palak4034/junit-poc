package org.palak4034.poc;

public class Finder
{
    public static int firstElement(int[] x, int element)
    {
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
