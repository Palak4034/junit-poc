package org.palak4034.poc;

import java.util.Arrays;

public class CheckPrimeNumber
{
    public static boolean isPrimeNumber(int finalN)
    {
        if (finalN < 1)
        {
            throw new IllegalArgumentException();
        }
        //initialization
        boolean[] numbers = new boolean[finalN + 1];
        Arrays.fill(numbers, true);
        numbers[1] = false;
        //sieve calculation
        for (int i = 2; i <= 3; i++)
        {
            if (numbers[i] == true)
            {
                for (int j = 2; (j * i) <= finalN; j++)
                {
                    numbers[j * i] = false;
                }
            }
        }
        return numbers[finalN];
    }
    
    
    /*public static void main(String[] ars)
    {
        System.out.println(isPrimeNumber(77));
    }*/
}
