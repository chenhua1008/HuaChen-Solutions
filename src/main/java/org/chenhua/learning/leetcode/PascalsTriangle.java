package org.chenhua.learning.leetcode;

import java.util.Arrays;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.deepToString(generate(5)));
	}
	
    public static int[][] generate(int numRows) {
        
    	int[][] array = new int[numRows][numRows];
        for (int i=0;i<numRows;i++)
        {
        	for (int j=0;j<numRows;j++)
        	{
        		if ((i>=2)&&(j>=1)&&(i<numRows))
        		{
        			array[i][j] = array[i-1][j-1] + array[i-1][j];
        		}
        		else if (j<=i)
        		{
        			array[i][j] = 1;
        		}
        		else
        		{
        			array[i][j] = 0;
        		}
        	}
        }
        return array;
    }

}
