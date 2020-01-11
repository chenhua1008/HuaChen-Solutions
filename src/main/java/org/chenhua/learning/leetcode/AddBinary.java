package org.chenhua.learning.leetcode;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("1010", "1011"));
	}
    public static String addBinary(String a, String b) {

        int posA = a.length()-1;
        int posB = b.length()-1;
        int carryFlag = 0;
        StringBuffer c = new StringBuffer();
        while ((posA >= 0)||(posB >= 0))
        {
            int tmp = carryFlag;
            if (posA >= 0)
            {
                tmp += a.charAt(posA)-'0';
            }
            if (posB >= 0)
            {
                tmp += b.charAt(posB)-'0';
            }
            carryFlag = tmp/2;
            c.append(tmp%2);
            posA --;
            posB --;
        }
        if (carryFlag == 1)
        {
            c.append(1);
        }
        return c.reverse().toString();
    }
}
