package org.chenhua.learning.leetcode;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("0P"));
	}
	
	public static boolean isPalindrome(String s) {
        String tmpStr = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (int i=(tmpStr.length()-1);i>=0;i--)
        {
            if (((tmpStr.charAt(i)>='a')&&(tmpStr.charAt(i)<='z'))
                ||((tmpStr.charAt(i)>='0')&&(tmpStr.charAt(i)<='9')))
            {
                sb.append(tmpStr.charAt(i));
            }
        }
        
//        String str2 = sb.toString();
//        String str1 = sb.reverse().toString();
        if ((sb.toString()).equals(sb.reverse().toString()))
        {
            return true;                      
        }
        return false;
    }

}
