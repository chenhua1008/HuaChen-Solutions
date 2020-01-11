package org.chenhua.learning.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(3).toString());
	}
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> tmpList = new ArrayList<Integer>();
        for (int i=0;i<=rowIndex;i++)
        {
            if (i == 0)
            {
                tmpList.add(1);
            }
            else if (i == 1)
            {
                tmpList.add(1);
            }
            else
            {
                int tmpInt = 0;
                
                for (int j=0;j<=rowIndex;j++)
                {
                    if (j==0)
                    {
                        tmpInt = 1;
                    }
                    else if (j>=i)
                    {
                        tmpList.add(1);
                        break;
                    }
                    else
                    {      
                        int tmpInt2 = tmpInt;  
                        tmpInt = tmpList.get(j);
                        tmpList.set(j, (tmpList.get(j))+tmpInt2);                     
                    }
                }
            }
        	
        }
        return tmpList;
    }
}
