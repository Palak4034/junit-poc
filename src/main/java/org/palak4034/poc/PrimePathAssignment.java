package org.palak4034.poc;

/**
 * Created by palak4034 on 3/10/18.
 */
public class PrimePathAssignment {

    public static String lcs(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] opt = new int[m+1][n+1];

        for (int i = m-1; i >= 0; i--) {
            System.out.println("Node 3_Yes");

            for (int j = n-1; j >= 0; j--) {
                System.out.println("Node 4_ j>=0");
                if (x.charAt(i) == y.charAt(j)) {
                    opt[i][j] = opt[i+1][j+1] + 1;
                }
                else {
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
                }
            }
        }

        System.out.println("Opt is : ");

        for(int[] d : opt) {
            for(int p : d) {
                System.out.print("\t" + p);
            }
            System.out.println();
        }

        // Recover LCS itself.
        String lcs = "";
        int i = 0, j = 0;
        while (i < m && j < n) {
            System.out.println("Node 10_Yes");
            if (x.charAt(i) == y.charAt(j)) {
                System.out.println("Node 11_Yes");
                lcs += x.charAt(i);
                i++;
                j++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) {
                System.out.println("Node 13_Yes");
                i++;
                System.out.println("Node 15");
            }
            else {
                System.out.println("Node 13_No");
                j++;
                System.out.println("Node 14");
            }
        }
        return lcs;
    }
}
