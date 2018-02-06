package org.palak4034.poc;

public class SumSquares
{
    public static int sumSquares(int start, int end) 
    {
        if(end < start)
        {
            return 0;
        }
        int sum = 0;
        for(int i = start; i <= end; i++)
        {
            sum = sum + (i*i);
        }
        return sum;
    }
}
