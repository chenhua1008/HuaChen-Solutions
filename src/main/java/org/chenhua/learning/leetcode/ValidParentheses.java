package org.chenhua.learning.leetcode;

import java.util.Stack;

public class ValidParentheses {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isValid(")"));
	}
	
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            switch (c)
            {
                case '(':
                	st.push('(');
                	break;
                case '{':
                	st.push('{');
                	break;
                case '[':
                	st.push('[');
                	break;
                case ')':
                	if (st.empty())
                	{
                		return false;
                	}
                	else if (st.peek() == '(')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    };
                    break;
                case '}':
                	if (st.empty())
                	{
                		return false;
                	}
                	else if (st.peek() == '{')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    };
                    break;
                case ']':
                	if (st.empty())
                	{
                		return false;
                	}
                	else if (st.peek() == '[')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    };
                    break;
            }
        }
        if (st.empty())
        {
            return true;
        }
        return false;
    }
}
