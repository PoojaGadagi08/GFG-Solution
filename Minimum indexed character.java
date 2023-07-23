Given a string str and another string patt. Find the minimum index of the character in str that is also present in patt.


Example 1:

Input:
str = geeksforgeeks
patt = set
Output: 1
Explanation: e is the character which is
present in given str "geeksforgeeks"
and is also presen in patt "set". Minimum
index of e is 1. 
Example 2:

Input:
str = adcffaet
patt = onkl
Output: -1
Explanation: There are none of the
characters which is common in patt
and str.

Your Task:
You only need to complete the function minIndexChar() that returns the index of answer in str or returns -1 in case no character of patt is present in str.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).


Constraints:
1 ≤ |str|,|patt| ≤ 105 
'a' <= stri, patti <= 'z'



  
class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < patt.length(); i++)
        {
            if(map.containsKey(patt.charAt(i)))
            {
                int index = map.get(patt.charAt(i));
                if(min>index)
                {
                    min=index;
                }
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
    }
}
