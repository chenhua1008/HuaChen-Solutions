package org.chenhua.learning.leetcode;

import java.util.Stack;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(2147483647));
	}
    public static boolean isPalindrome(int x) {
        if (x < 0)
        {
            return false;
        }
        else if (x < 10)
        {
            return true;
        }
        else
        {
            int retInt = 0;
            int curX = x;
            Stack<Integer> sta = new Stack<Integer>();
            while(curX >= 10)
            {
            	sta.push(curX%10);
                curX = curX/10;
            }
            sta.push(curX);
            int size = sta.size();
            for (int i=0;i<size;i++)
            {	
            	if ((Integer.MAX_VALUE - retInt)< (int)sta.peek()*Math.pow(10, i))
            	{
            		return false;
            	}
            	else
            	{
            		retInt = (int) (retInt + (int)sta.pop()*Math.pow(10, i));
            	}
            	
            }
            if (x == retInt)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

}
